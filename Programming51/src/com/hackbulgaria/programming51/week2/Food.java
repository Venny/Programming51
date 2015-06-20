package com.hackbulgaria.programming51.week2;

/**
 * Created by Inspired Day on 6/20/2015.
 */
public class Food {
    private String name;
    private String type;
    private int weight;

    public  Food(String name,String type, int weight){
        this.name = name;
        this.type = type;
        this.weight = weight;
    }

    public String toString(){
        return name + " - " + type + ": " + weight + "grams";
    }

    public String getType(){
        return type;
    }

    public int getItemWeight(){
        return weight;
    }

}
