package com.hackbulgaria.programming51.week7.addbot;

/**
 * Created by Inspired Day on 7/27/2015.
 */
public class AdBot {
    private String[] data;
    private int counter;

    public AdBot(String[] data){
        this.data = data;
        this.counter = 0;
    }
    public void showNextAd() {
        System.out.println(data[counter]);
        counter = (counter < data.length - 1) ? counter + 1 : 0 ;
    }
}
