import json
import os
import textwrap
from sinlingmaster.sinling import  SinhalaTokenizer

_all_songs = None

class SongData():

    def __init__(self, id_, track_id, track_name_en, track_name_si, track_rating, album_name_en, 
                album_name_si, artist_name_en, artist_name_si, artist_rating, lyrics, genres="", movie=""):
        self.id = id_
        self.track_id = track_id
        self.track_name_en = track_name_en
        self.track_name_si = track_name_si 
        self.track_rating = track_rating
        self.album_name_en = album_name_en
        self.album_name_si =  album_name_si
        self.artist_name_en = artist_name_en
        self.artist_name_si = artist_name_si
        self.artist_rating = artist_rating
        self.lyrics = lyrics
        self.genres = genres
        self.movie = movie

    def __str__(self):
        return textwrap.dedent("""\
            ID: {}
            Title_EN: {}
            Title_SI: {}
            Rating: {}
            Album_EN: {}
            Album_SI: {}
            Artist_EN: {}
            Artist_SI: {}
            Artist Rating: {}
            Lyrics_SI: {}
            genres_SI: {}
            movie_SI: {}
        """).format(self.id, 
                    self.track_name_en,
                    self.track_name_si,
                    self.track_rating,
                    self.album_name_en,
                    self.album_name_si,
                    self.artist_name_en,
                    self.artist_name_si,
                    self.artist_rating,
                    self.lyrics,
                    self.genres,
                    self.movie)


def all_songs():
    """
    Returns a list of SongData objects, loaded from
    searchapp/songs.json
    """

    global _all_songs

    if _all_songs is None:
        _all_songs = []
        tokenizer = SinhalaTokenizer()

        # Load the songs json from the same directory as this file.
        dir_path = os.path.dirname(os.path.realpath(__file__))
        songs_path = os.path.join(dir_path, 'merged_songs.json')
        with open(songs_path) as song_file:
            for idx, song in enumerate(json.load(song_file, strict=False)):
                id_ = idx + 1  # ES indexes must be positive integers, so add 1
                song_data = SongData(id_, **song)
                tokenized_lyrics = ""
                tokens = tokenizer.tokenize(song_data.lyrics)
                for token in tokens:
                    tokenized_lyrics += token + " "
                
                #tokenize lyrics
                song_data.lyrics = tokenized_lyrics
                if (float(song_data.track_rating) >9):
                    song_data.track_rating = 9.0
                else:
                    song_data.track_rating = float(song_data.track_rating)
                _all_songs.append(song_data)


        tokenizer = SinhalaTokenizer()
        #print("first file")
        #print(_all_songs[0].lyrics)
        #print(tokenizer.tokenize(_all_songs[0].lyrics))
        
    return _all_songs
