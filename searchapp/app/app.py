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
        'amma'
    ]

    num_results = 10
    songs_by_category = [(t, search(t, num_results)) for t in search_terms]
    return render_template(
        'index.html',
        songs_by_category=songs_by_category,
    )


@app.route('/search', methods=['GET', 'POST'])
def search_single_song():
    """
    Execute a search for a specific search term.

    Return the top 50 results.
    """
    query = request.args.get('search')
    artist_name = request.args.get('artist_name')
    min_rating = request.args.get('min_rating')
    num_results = 50
    songs_by_category = [(query, search(query, num_results, artist_name, min_rating))]
    return render_template(
        'index.html',
        songs_by_category=songs_by_category,
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
