package com.bulgaria.programing51.week2;

/**
 * Created by Inspired Day on 6/15/2015.
 */
public class Coffee {
    public String brand = "";
    public float price = 1.0f;
    public String toString() {
        return brand;
    }

    public static void main(String arg[]){
        Coffee firstCup = new Coffee();
        firstCup.brand = "Late";
        firstCup.price = 0.5f;

        Coffee secondCup = new Coffee();
        secondCup.brand = "Late2";
        secondCup.price = 0.5f;

        Coffee thirdCup = new Coffee();
        thirdCup.brand = "Late3";
        thirdCup.price = 0.5f;

        System.out.println(firstCup.toString() + " " + secondCup.toString() + " " + thirdCup.toString());

    }
}
