from elasticsearch import Elasticsearch
from elasticsearch_dsl import Search
from typing import List

from searchapp.constants import DOC_TYPE, INDEX_NAME

HEADERS = {'content-type': 'application/json'}


class SearchResult():
    """Represents a product returned from elasticsearch."""
    def __init__(self, id_, track_name_si, track_name_en):
        self.id = id_
        self.track_name_si = track_name_si
        self.track_name_en = track_name_en

    def from_doc(doc) -> 'SearchResult':
        print(doc)
        return SearchResult(
                id_ = doc.meta.id,
                track_name_en = doc.track_name_en,
                track_name_si = doc.track_name_si,
            )


def search(term: str, count: int) -> List[SearchResult]:
    client = Elasticsearch()

    # Elasticsearch 6 requires the content-type header to be set, and this is
    # not included by default in the current version of elasticsearch-py
    client.transport.connection_pool.connection.headers.update(HEADERS)

    s = Search(using=client, index=INDEX_NAME, doc_type=DOC_TYPE)
    #name_query = {'match_all': {}}
    #name_query = {"term": {"track_name_si":term}}
    name_query = {"match": {"track_name_si": { 'query' : term, 'operator' : 'and', 'fuzziness' : "AUTO"}}}
    docs = s.query(name_query)[:count].execute()


    return [SearchResult.from_doc(d) for d in docs]
 