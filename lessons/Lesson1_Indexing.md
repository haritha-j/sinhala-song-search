# Lesson 1: Indexing
We’ve provided a basic example of indexing data into elasticsearch to get you started. Step one is just running the indexer, and examining the results.

## Part 1: Starting the Flask App

### What you need to do:
1. Run `python searchapp/index_songs.py`
2. Run `python searchapp/run.py`

### How you’ll know it worked:
1. http://localhost:9200/songs_index/song/1 shows information about “A Great song”.
2. http://localhost:9200/songs_index shows information about the songs index.
2. http://127.0.0.1:5000 returns “A Great song” for every search term.


## Part 2: Indexing a Single song
Now that we know that everything is working, it’s time to put real data in the index.

### What you need to do:
Modify the `index_song` function in `searchapp/index_song.py`.

The `song` object passed into `index_song` is currently not used for anything. Use it inside es.create.

### How you’ll know it worked:
Once you re-run index song, you’ll find that “A Great song” has been replaced by “835 Mid-RIse Capri” everywhere.

### Helpful information
Open up `searchapp/index_songs.py`. You’ll notice that `index_song` currently takes a `songData` object as an argument.

Currently, `index_song` does not use this argument. It creates a single song in the index using hardcoded data for `A Great song` with the image of a kitten.

For this step, you’ll need to modify `index_song` to use the `songData` objected passed in.

#### Errors you might see:
<details>
<summary>elasticsearch.exceptions.ConflictError</summary>
When we create a document in elasticsearch, we must include a unique id. Are you passing the same id for every song in the es.create call? You should be passing `song.id`.
</details>

<details>
<summary>
ImportError: No module named searchapp.app.app
</summary>
Full Error Message:
```
Traceback (most recent call last):
  File "run.py", line 1, in <module>
    from searchapp.app.app import app
ImportError: No module named searchapp.app.app
```
All of our requirements were installed in a [virtual env](https://docs.python.org/3/library/venv.html). Is yours activated?

Run `source venv/bin/activate` from the root of the repository to activate the venv.
</details>

## Part 3: Indexing 20,000 more songs
One song down, 19,999 to go.

### What you need to do:
Modify index_song to insert everything from `searchapp/songs.json`, instead of just the first item.

### How you’ll know it worked:
http://127.0.0.1:5000 will now show nine songs for every search result.

### Helpful information
All of the song data that we will be using in this workshop is stored in a json file, `searchapp/songs.json`.

`searchapp/data.py` takes care of loading that json.

Take a look at `searchapp/data.py`. It defines a class, `songData` and a function, `all_songs`.

`all_songs` returns a list of `songData` objects created with the data in `searchapp/songs.json`.

In this problem, you will need to modify `index_songs` in `searchapp/index_songs.py` to these songs into your songs index.

## Part 4: Bulk Indexing
We’re ready to start searching now! But let’s take a quick diversion to make indexing faster.

It takes about a minute to index 20,000 songs. Inserting documents into elasticsearch one by one is slow. Fortunately, Elasticsearch has a bulk api, and elasticsearch-py provides a great wrapper around it.

### What you need to do:
Write a function called `songs_to_index` to bulk index all the songs.

### How you’ll know it worked:
When you run index_songs.py should take only a few seconds to run, and http://127.0.0.1:5000 should continue to show nine results.


### Helpful information:
You’re going to invoke the `bulk` from `elasticsearch.helpers`, and pass it an iterable containing one insert action for each song. Your iterable can just be a list, or you can write a generator function and pass that to bulk.

Each action is a dictionary containing some special fields that start with underscores, and a `doc` field that contains the actual document to index.

You’ll want to:

1. Specify an `_op` type of index
2. Set `_index` and `_type` (doc type) to the appropriate constants
3. Provide the document (under the `_source` key), and `_id` just like in index_song


#### Where are the docs?
https://www.elastic.co/guide/en/elasticsearch/reference/current/docs-bulk.html
http://elasticsearch-py.readthedocs.io/en/master/helpers.html
