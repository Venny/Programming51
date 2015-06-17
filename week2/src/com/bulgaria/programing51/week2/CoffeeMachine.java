package com.bulgaria.programing51.week2;

/**
 * Created by Inspired Day on 6/15/2015.
 */
public class CoffeeMachine {
    public static Coffee[] coffeeList = new Coffee[10];
    public float balance = 0.0f;

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
        System.out.println("Your change: " + newMachine.buyCoffee("Moka",3.40f));
        System.out.println("Current balance: " + newMachine.balance);
    }

    public void addCoffee(Coffee coffee){
       // coffeeList.add(coffee);
        for(int i = 0; i <= coffeeList.length; i++){
           if(coffeeList[i] == null){
               coffeeList[i] = coffee;
               return;
           }
        }
    }
    public float buyCoffee(String name, float money){
        float change = 0;
        for(int i = 0; i <= coffeeList.length; i++){
            if( coffeeList[i] != null && coffeeList[i].brand.equals(name) ){
                balance = money + balance;
                change = money - coffeeList[i].price;
                return change;
            }
        }
        return change;
    }

}
