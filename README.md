# Sinhala Song Search
JMHA Jayasinghe - 160238R


## Overview

This repository provides a flask app which let's a user search through a dataset of Sinhala songs using elasticSearch.

## Dataset

The dataset is collected from two sources, and merged together using artist name and track name.
1. Sinhala Song Corpus - `songs.json`
2. Data scraped from sinhalasongbook.com - `scraped_songs2.json`

Code for scraping - `scraper.py`
Code for merging data - `searchapp/app/merge.py`

Available fields -

```track_name_en, track_name_si, track_rating, album_name_en, album_name_si, artist_name_en, artist_name_si, artist_rating, genres, movie, lyrics```


## Indexing

Indexing strategies used ;

1. Custom analyzer for sinhala characters for lyrics - Tokenization and stemming is done through https://github.com/ysenarath/sinling, then rejoined into a string, which is retokenized using elasticSearch whitespace tokenizer.

2. Stopword detection - Custom stop words are used for indexing lyrics

3. Boosting fields - Song names are boosted to increase relevance scores

Code for indexing - `searchapp/index_songs.py`

## Search

The primary search box provides a unified search across all text fields. 

Additional inputs allow filtering the results using artist name, album name and minimum rating.

Internally, a `disjunctive-max` search is used to search across multiple fields, and filters are added onto those results.

### Custom query processing - 

a. user can search for "top n *" where * is any normal query : this will only result the top n results

b. * by 'artist_name' - automatically filters the results by the given artist name

c. the keyword "songs" triggers a `match_all` query instead of the `disjunctive-max` query. This can be utlized to make queries like "songs by amaradewa" 

code for searching and query processing - `searchapp/search.py` & `searchapp/search.py`
