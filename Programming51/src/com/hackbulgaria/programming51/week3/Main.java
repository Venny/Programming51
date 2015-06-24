package com.hackbulgaria.programming51.week3;

/**
 * Created by Inspired Day on 6/24/2015.
 */
public class Main {
    public static void main(String args[]){
        Employee rado = new Employee("Radoslav Georgiev");
        System.out.println(rado.toString().equals("Radoslav Georgiev")); // true

        Employee ivo = new Employee("Ivaylo");
        TravelExpense dinner = new TravelExpense("Dinner", ivo, 100);

        System.out.println(dinner.getType().equals("Dinner")); // true
        System.out.println(dinner.getEmployee().toString().equals("Ivaylo")); // true
        System.out.println(dinner.getNetCost() == 100); // true

        Travel conf = new Travel("Berlin", "Germany", 20);

        System.out.println(conf.getCity().equals("Berlin")); // true
        System.out.println(conf.getCountry().equals("Germany")); // true
        System.out.println(conf.getVat() == 20); // true, VAT = Value Added Tax = ÄÄÑ
    }
}
