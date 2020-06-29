from selenium import webdriver
from selenium.webdriver.common.by import By
import time
import json

from bs4 import BeautifulSoup
import pandas as pd

options = webdriver.ChromeOptions()
options.add_argument("--disable-popup-blocking")
driver = webdriver.Chrome(chrome_options=options, executable_path="/usr/bin/chromedriver")

songs=[] #List to store names of the songs
songs_sinhala = []
artists=[] #List to store names of the artists
lyric_auths = []
music_auths = []
movies = []
genres = []
lyrics = []

data  ={}
data['songs']=[];


#loop through pages
for j in range(10,20):
    try:
        """
        if (j == 0):
            driver.get(url)
        else:
            url = driver.find_element_by_xpath('//*[@title="Go to next page"]').get_attribute('href')
            print(url)
            driver.get(url)
        """

        url = "https://sinhalasongbook.com/all-sinhala-song-lyrics-and-chords/?_page=" + str(j+1)
        driver.get(url)
        song_links = driver.find_elements_by_class_name('pt-cv-title')
        print(len(song_links))

        #loop through song links
        for i in range(len(song_links)):
            #if (i ==3):
            #    break

            #refresh links and access individual links
            song_links = driver.find_elements_by_class_name('pt-cv-title')
            print(len(song_links))

            try:
                link = song_links[i].find_element_by_class_name('_blank').get_attribute('href')
            except:
                time.sleep(30)
                driver.get(url)
                song_links = driver.find_elements_by_class_name('pt-cv-title')
                link = song_links[i].find_element_by_class_name('_blank').get_attribute('href')

            print(link)
            driver.get(link)
            
            #access page contents via beautiful soup
            content = driver.page_source
            soup = BeautifulSoup(content, features="html.parser")

            #extract metadata
            try:
                artist=soup.find('span', attrs={'class':'entry-categories'})
                artist=artist.text[8:]
            except:
                artist=""

            try:
                lyric_auth=soup.find('span', attrs={'class':'lyrics'})
                lyric_auth=lyric_auth.text[8:]
            except:
                lyric_auth=''

            try:
                music_auth=soup.find('span', attrs={'class':'music'})
                music_auth=music_auth.text[7:]
            except:
                music_auth=''

            try:
                movie=soup.find('span', attrs={'class':'movies'})
                movie = movie.text[7:]
            except:
                movie = ''

            try:
                name=soup.find('h1', attrs={'class':'entry-title'})
                eng_sin = name.text.split('–')
                song = eng_sin[0]
                if(len(eng_sin) ==2):
                    song_sinhala = eng_sin[1]
                else:
                    song_sinhala = ''
            except:
                song  =''
                song_sinhala =  ""

            try:
                song_genres=soup.find('span', attrs={'class':'entry-tags'})
                genreString = ""
                for genre in song_genres.findAll('a'):
                    genreString += genre.text + "/"
                
            except:
                genreString = ''
                
            data['songs'].append({
                'artist': artist,
                'lyric_auth': lyric_auth,
                'music_auth': music_auth,
                'movie': movie,
                'song': song,
                'song_genres': genreString
            })

            driver.back()
    
    except:
        print("skipping rest of page ")

with open("scraped_songs2.json", 'w') as outfile:
    json.dump(data, outfile)

#add all data to dataframe
df = pd.DataFrame({'song_name':songs, 'song_name_sinhala':songs_sinhala, 'artist':artists, 'Lyric_auth':lyric_auths, 'music_auth':music_auths, 'movie':movies, 'genre':genres, 'lyrics':lyrics}) 
df.to_csv('songs.csv', index=False, encoding='utf-8')
