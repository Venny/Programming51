package com.hackbulgaria.programming51.week3;

/**
 * Created by Inspired Day on 6/24/2015.
 */
public class Employee {
    private String name;
    private int expenses;


    public Employee(String name){
        this.name = name;
        this.expenses = 0;
    }

    public String toString(){
        return name;
    }

    public void addExpense(int netcost){
        expenses += netcost;
    }

    public String getName(){
        return name;
    }

    public int getExpenses(){
        return expenses;
    }
}
