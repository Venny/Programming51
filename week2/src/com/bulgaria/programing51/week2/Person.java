package com.bulgaria.programing51.week2;

/**
 * Created by Inspired Day on 6/15/2015.
 */
public class Person {
    // Explicit is always better than implicit
    public String firstName = "";
    public String lastName = "";
    public String gender = "female";
    int age = 0;

    public static void main(String args[]){
        Person ivan = new Person();
        ivan.firstName = "Ivan";
        System.out.print(ivan);
        System.out.print(ivan.firstName);
        
        String name1 = new String("");
        String name2 = new String("");
        boolean a = (name1 != name2); // sravnqvame referencii

        String name3 = "";
        String name4 = "";
        boolean b = (name1 == name2); // sravnqvame stoinosti
        
    }
}
