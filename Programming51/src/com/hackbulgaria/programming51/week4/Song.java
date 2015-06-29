package com.hackbulgaria.programming51.week4;

/**
 * Created by Inspired Day on 6/29/2015.
 */
public class Song {
    private String name;
    private String artist;
    private int duration;
    private String album;

    public Song(String name, String artist, int duration, String album){
        this.name = name;
        this.artist = artist;
        this.duration = duration;
        this.album = album;
    }

    public String toString(){
        return name + " " + artist;
    }

    public String getAlbum(){
        return album;
    }
}
