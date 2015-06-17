package com.hackbulgaria.programming51.week2;

import java.lang.reflect.Array;

/**
 * Created by Inspired Day on 6/15/2015.
 */
public class Person {
    public String firstName = "";
    public String lastName = "";
    public int age = 18;

    public static void main(String args[]){
        Auto [] myCars = new Auto[10];
        AutoShop autoShop = new AutoShop(myCars);


        Person ivan = new Person();
        ivan.firstName = "Ivan";
        ivan.lastName = "Ivanov";
        ivan.age = 25;

        Auto audi = new Auto();
        audi.owner = ivan;
        audi.maxSpeed = 200;
        audi.brand = "Audi";
        audi.name = "Begachka";
        audi.price = 5000;

        //System.out.println(audi);
        autoShop.addCar(audi);
    }

    public String toString(){
        return firstName + " " + lastName;
    }
}
