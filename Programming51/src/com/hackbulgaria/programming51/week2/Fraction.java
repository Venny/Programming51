package com.hackbulgaria.programming51.week2;

/**
 * Created by Inspired Day on 6/20/2015.
 */
public class Fraction {
    public int num;
    public int den;

    public String toString(){
        return num + "/" + den;
    }

    public static void main(String args[]){
        Fraction a = new Fraction();
        a.num = 4;
        a.den = 12;

        //System.out.println(a);
        //System.out.println(a.getReal());

        Fraction b = new Fraction();
        b.num = 5;
        b.den = 24;
        //a.sum(b);
        System.out.println(a);
        a.simplify();
        System.out.println(a);
    }


    public double getReal(){
        return (double) num / (double) den;
    }

    public void sum(Fraction fract2){
        int newNum = (num * fract2.den) + (fract2.num * den);
        int newDen = den * fract2.den;
        System.out.println(newNum + "/" + newDen);
    }

    public void simplify(){
        int smallest = (num > den)? den: num;
        for(int i = smallest; i >= 2; i--){
            if(num % i == 0 && den % i == 0){
                num /= i;
                den /= i;
            }
        }
    }
}
