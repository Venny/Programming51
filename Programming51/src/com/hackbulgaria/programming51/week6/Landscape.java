package com.hackbulgaria.programming51.week6;

import java.util.ArrayList;

/**
 * Created by Inspired Day on 7/13/2015.
 */
public class Landscape {
    ArrayList<Tile> tileList;


    public Landscape(){
        this.tileList = new ArrayList<>();
    }
    public void addTile(Tile t){
        tileList.add(t);
    }

    public String renderAll(){
        String temp = "";
        for(int i = 0; i < tileList.size(); i++){
            temp += tileList.get(i).render();
        }
        return temp;
    }
}
