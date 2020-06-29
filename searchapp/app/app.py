from flask import Flask, render_template, request
from searchapp.data import all_songs
from searchapp.app.search import search

app = Flask(__name__)


@app.route('/')
@app.route('/index')
def index():
    """
    Search for songs across a variety of terms, and show 9 results for each.
    """
    search_terms = [
        ''
    ]

    num_results = 10
    songs_by_category = [(t, search(t, num_results)) for t in search_terms]
    return render_template(
        'index.html',
        songs_by_category=songs_by_category,
    )

#identify  "top n" queries and "by artist" queries
def preprocessTerm(term):
    text_split = term.split()
    top = False;
    num_results = 25
    if (text_split[0].strip() == "top"):
        try:
            num_results = int(text_split[1].strip())
            print(num_results)
            top = True;
        except e:
            print("error converting to int")

    artist_split = term.split("by")
    if len(artist_split)>1:
        return artist_split[0], artist_split[1], num_results, top
    else:
        return term, "", num_results, top

@app.route('/search', methods=['GET', 'POST'])
def search_single_song():
    """
    Execute a search for a specific search term.

    Return the top 25 results.
    """
    query = request.args.get('search')

    query, artist_name, num_results, top = preprocessTerm(query)


    if request.args.get('artist_name') !="":
        artist_name = request.args.get('artist_name')
    album_name = request.args.get('album_name')
    min_rating = request.args.get('min_rating')
    


    songs_by_category = [(query, search(query, 100, artist_name, album_name, min_rating))]

    if (num_results < len(songs_by_category[0][1])):
        results=  songs_by_category[0][1][:num_results]
    else:
        results=  songs_by_category[0][1]
        
    res =[(songs_by_category[0][0], results),]

    #print(len(songs_by_category[0][1]))

    return render_template(
        'index.html',
        songs_by_category=res,
        search_term=query,
        artist_name=artist_name,
        min_rating=min_rating
    )


@app.route('/song/<int:song_id>')
def single_song(song_id):
    """
    Display information about a specific song
    """

    song = str(all_songs()[song_id - 1])

    return render_template(
        'song.html',
        song_json=song,
        search_term='',
    )
