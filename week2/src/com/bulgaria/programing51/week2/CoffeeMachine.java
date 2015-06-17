package com.bulgaria.programing51.week2;

import java.util.ArrayList;

/**
 * Created by Inspired Day on 6/15/2015.
 */
public class CoffeeMachine {
    public int coffeeNum = 0;
    public ArrayList<Coffee> coffeeList;

    public static void main(String args[]){
        CoffeeMachine newMachine = new CoffeeMachine();
        Coffee java = new Coffee();
        Coffee moka = new Coffee();

        java.brand = "Java";
        java.price = 1.00f;

        moka.brand = "Moka";
        moka.price = 1.50f;

        newMachine.addCoffee(java);
        newMachine.addCoffee(moka);
        System.out.println(newMachine.buyCoffee("Latte",3.40f));
    }

    public void addCoffee(Coffee coffee){
        coffeeList.add(coffee);
    }
    public float buyCoffee(String name, float money){
        if(coffeeList.contains(name)){

        }
        return money;
    }

}
