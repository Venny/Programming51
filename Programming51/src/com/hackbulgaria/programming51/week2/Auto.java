package com.hackbulgaria.programming51.week2;

/**
 * Created by Inspired Day on 6/17/2015.
 */
public class Auto {
    public Person owner;
    public int maxSpeed;
    public String brand;
    public String name;
    public float price;

    public String toString(){
        return brand + " " + name + ", Max Speed: " + maxSpeed + ", Price: " + price + ", Owner: " + owner + ", age: " + owner.age;
    }
}
