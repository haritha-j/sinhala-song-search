from elasticsearch import Elasticsearch
from elasticsearch.helpers import parallel_bulk

from searchapp.constants import DOC_TYPE, INDEX_NAME
from searchapp.data import all_products, ProductData


def main():
    # Connect to localhost:9200 by default.
    es = Elasticsearch()

    es.indices.delete(index=INDEX_NAME, ignore=404)
    es.indices.create(
        index=INDEX_NAME,
        body={
            'mappings': 
                {DOC_TYPE: {                                   # This mapping applies to products.
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
    products = all_products()
    for product in products:
        doc = {
            '_op_type' : 'index',
            '_index' : INDEX_NAME,
            '_type' : DOC_TYPE,
            '_id' : product.id,
            '_source' : {"name": product.name,
                    "image": product.image,}
             }
        actions.append(doc)

    index_products(es, actions)


def index_products(es, actions):
    """Add multiple products to the ProductData index."""
    
    for success, info in parallel_bulk(es, actions, thread_count=6):
        if not success:
            print('A document failed:', info)
    
    """es.create(
        index=INDEX_NAME,
        doc_type=DOC_TYPE,
        id=product.id,
        body={
            "name": product.name,
            "image": product.image,
        }
    )"""

    # Don't delete this! You'll need it to see if your indexing job is working,
    # or if it has stalled.


if __name__ == '__main__':
    main()
