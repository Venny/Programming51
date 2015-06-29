package com.hackbulgaria.programming51.week4;

/**
 * Created by Inspired Day on 6/29/2015.
 */
public class MusicOrganiser {
    Vector<Song> songs;

    public MusicOrganiser(){
        songs = new Vector<Song>();
    }

    public void addSong(Song s){
        songs.add(s);
    }

    public int getCount(){
        return songs.getSize();
    }

    public Vector<String> getAlbums(){
        Vector<String> albums = new Vector<String>();
        for(int i = 0; i <= songs.getSize(); i++){
            albums.add(getAlbum(i));
        }
        return albums;
    }

    private String getAlbum(int index){
        return songs.getElement(index).getAlbum();
    }

}