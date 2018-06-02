package net.tunify.tunify.model;

/**
 * Created by Pandika on 6/2/2018.
 */

public class Album {
    private String name;
    private int numOfSongs;
    private int thumbnail;

    public String getName() {
        return name;
    }

    public int getNumOfSongs() {
        return numOfSongs;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public Album(String name, int numOfSongs, int thumbnail) {

        this.name = name;
        this.numOfSongs = numOfSongs;
        this.thumbnail = thumbnail;
    }
}
