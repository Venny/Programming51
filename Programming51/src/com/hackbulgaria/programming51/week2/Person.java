package com.hackbulgaria.programming51.week2;

/**
 * Created by Inspired Day on 6/15/2015.
 */
public class Person {
    public String firstName = "";
    public String lastName = "";
    public int age = 18;

    public static void main(String args[]){
        Auto [] myCars = new Auto[10];

        Person ivan = new Person();
        ivan.firstName = "Ivan";
        ivan.age = 25;

        Auto audi = new Auto();

        audi.owner = ivan;
        audi.maxSpeed = 250;
        audi.brand = "Audi";
        audi.name = "Begachka";
        audi.price = 5000;

        Person gosho = new Person();
        gosho.firstName = "Gosho";
        gosho.age = 25;

        Auto peugeot = new Auto();

        peugeot.owner = gosho;
        peugeot.maxSpeed = 220;
        peugeot.brand = "Peugeot";
        peugeot.name = "Dragster";
        peugeot.price = 10000;

        AutoShop autoShop = new AutoShop(myCars);
        autoShop.addCar(audi);
        autoShop.addCar(peugeot);

        System.out.println(autoShop.getTopSpeed());
    }

    public String toString(){
        return firstName + " " + lastName;
    }
}
