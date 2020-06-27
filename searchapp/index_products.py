from elasticsearch import Elasticsearch
from elasticsearch.helpers import parallel_bulk

from searchapp.constants import DOC_TYPE, INDEX_NAME
from searchapp.data import all_songs, songData


def main():
    # Connect to localhost:9200 by default.
    es = Elasticsearch()

    es.indices.delete(index=INDEX_NAME, ignore=404)
    es.indices.create(
        index=INDEX_NAME,
        body={
            'mappings': 
                {DOC_TYPE: {                                   # This mapping applies to songs.
                    'properties': {                             # Just a magic word.
                        'name': {                                 # The field we want to configure.
                            'type': 'text',                         # The kind of data we’re working with.
                            'fields': {                             # create an analyzed field.
                                'english_analyzed': {                 # Name that field `name.english_analyzed`.
                                    'type': 'text',                     # It’s also text.
                                    'analyzer': 'custom_english_analyzer',              # And here’s the analyzer we want to use.
                                }
                            }
                        }
                    }
                }
            },
            'settings': {
                'analysis': {                                                 # magic word.
                    'analyzer': {                                             # yet another magic word.
                        'custom_english_analyzer': {              # The name of our analyzer.
                            'type': 'english',                               # The built in analyzer we’re building on.
                            'stopwords': ['made', '_english_'],   # Our custom stop words, plus the defaults.
                        },
                    },
                },
            },
        },
    )
    actions = []
    songs = all_songs()
    for song in songs:
        doc = {
            '_op_type' : 'index',
            '_index' : INDEX_NAME,
            '_type' : DOC_TYPE,
            '_id' : song.id,
            '_source' : {"name": song.name,
                    "image": song.image,}
             }
        actions.append(doc)

    index_songs(es, actions)


def index_songs(es, actions):
    """Add multiple songs to the songData index."""
    
    for success, info in parallel_bulk(es, actions, thread_count=6):
        if not success:
            print('A document failed:', info)
    
    """es.create(
        index=INDEX_NAME,
        doc_type=DOC_TYPE,
        id=song.id,
        body={
            "name": song.name,
            "image": song.image,
        }
    )"""

    # Don't delete this! You'll need it to see if your indexing job is working,
    # or if it has stalled.


if __name__ == '__main__':
    main()
