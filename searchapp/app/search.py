from elasticsearch import Elasticsearch
from elasticsearch_dsl import Search
from typing import List
from sinlingmaster.sinling import  SinhalaTokenizer

from searchapp.constants import DOC_TYPE, INDEX_NAME

HEADERS = {'content-type': 'application/json'}


class SearchResult:
    """Represents a song returned from elasticsearch."""

    def __init__(self, id_, track_name_si, track_name_en, artist_name_si, album_name_si, track_rating, genres, movie):
        self.id = id_
        self.track_name_si = track_name_si
        self.track_name_en = track_name_en
        self.album_name_si = album_name_si
        self.artist_name_si = artist_name_si
        self.track_rating = track_rating
        self.genres = genres
        self.movie=movie

    def from_doc(doc) -> 'SearchResult':
        print(doc)
        return SearchResult(
            id_=doc.meta.id,
            track_name_en=doc.track_name_en,
            track_name_si=doc.track_name_si,
            album_name_si=doc.album_name_si,
            artist_name_si=doc.artist_name_si,
            track_rating=doc.track_rating,
            genres=doc.genres,
            movie=doc.movie
        )


def search(term: str, count: int, artist_name=None, album_name=None, genre=None, min_rating=0) -> List[SearchResult]:
    client = Elasticsearch()
    #client = Elasticsearch('http://elastic:changeme@192.168.43.2:9200/')


    client.transport.connection_pool.connection.headers.update(HEADERS)

    s = Search(using=client, index=INDEX_NAME, doc_type=DOC_TYPE)

    #tokenize the query (only used for lyrics search)
    tokenizer = SinhalaTokenizer()
    tokenized_query_for_lyrics = ""
    tokens = tokenizer.tokenize(term)
    for token in tokens:
        tokenized_query_for_lyrics += token + " "
    
    #fitlers to add faceted search
    filters = []
    """
    #filter songs by genre
    if genre is not None and genre != '':
        genre_facet = {
            "match": {
                "album_name_si": {
                    "query": genre,
                    "fuzziness": "AUTO"
                }
            }
        }

        filters.append(genre_facet)
    """

    #filter songs by minumum rating
    if min_rating != '' and float(min_rating) > 0:
        rating_facet = {
            "range": {
                "track_rating": {
                    "gte": float(min_rating)
                }
            }
        }

        filters.append(rating_facet)

    #filter songs by artist name
    if artist_name is not None and artist_name != '':
        artist_facet = {
            "match": {
                "artist_name_si": {
                    "query": artist_name,
                    "fuzziness": "AUTO"
                }
            }
        }

        filters.append(artist_facet)

    #filter songs by album name
    if album_name is not None and album_name != '':
        album_facet = {
            "match": {
                "album_name_si": {
                    "query": album_name,
                    "fuzziness": "AUTO"
                }
            }
        }

        filters.append(album_facet)

    #query from all available fields

    if (term.strip()=="songs"):
        query = {
            "bool": {
                "must": [{"match_all":{}}
                ],
                "filter": filters
            }
        }
    else:
        query = {
            "bool": {
                "must": [{
                    "dis_max": {
                        "queries": [
                            {"match": { "track_name_si":{"query": term, "fuzziness": "AUTO"}}},
                            {"match": { "lyrics_analyzed":{"query": tokenized_query_for_lyrics, "fuzziness": "AUTO"}}},
                            {"match": { "album_name_si":{"query": term, "fuzziness": "AUTO"}}},
                            {"match": { "artist_name_si":{"query": term, "fuzziness": "AUTO"}}},
                            {"match": { "genres":{"query": term, "fuzziness": "AUTO"}}},
                            {"match": { "movie":{"query": term, "fuzziness": "AUTO"}}}
                        ],
                        "tie_breaker" : 0.5
                    }
                }],
                "filter": filters
            }
        }


    '''
    query = {
        "bool": {
            "must": [{
                "match": {
                    "track_name_si": {
                        "query": term,
                        "fuzziness": "AUTO"
                    }
                }
            }],
            "filter": filters
        }
    }'''

    print(query)
    docs = s.query(query)[:count].execute()

    return [SearchResult.from_doc(d) for d in docs]
