from searchapp.data import all_songs
import json



with open("merged_songs.json", 'w', encoding='utf8') as outfile:
    with open("scraped_songs.json", 'r') as f2:
        with open("songs.json", 'r') as f1:
            scraped_songs = json.load(f2)
            

            songs = []
            for idx, song2 in enumerate(json.load(f1, strict=False)):
                #print(song2)
                for song in scraped_songs["songs"]:
                    #print(song["song"]
                
                    if ((song["song"].strip() == song2["track_name_en"].strip()) and (song["artist"].strip() == song2["artist_name_en"].strip())):
                        print(song["song"])
                        song2["genres"] = song["song_genres"]
                        song2["movie"] = song["movie"]
                
                songs.append(song2)

    json.dump(songs, outfile, ensure_ascii=False)
