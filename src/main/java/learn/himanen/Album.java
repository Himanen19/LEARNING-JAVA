package learn.himanen;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String titleOfSong, double duration) {
        if (findSong(titleOfSong) == null) {
            songs.add(new Song(titleOfSong, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title) {

        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).getTitle().equals(title)) {
                return songs.get(i);
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> list) {
        int index = trackNumber - 1;
        if (index >= 0 && (index < songs.size())) {
            list.add(songs.get(index));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> list) {
        Song songsId = findSong(title);
        if (songsId != null) {
            if (!list.contains(songsId)) {
                list.add(songsId);
                return true;
            }
        }
        return false;
    }
}

class Song {
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }


    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title + ": " + duration;
    }
}
