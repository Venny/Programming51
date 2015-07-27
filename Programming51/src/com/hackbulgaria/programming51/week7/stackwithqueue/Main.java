package com.hackbulgaria.programming51.week7.stackwithqueue;

/**
 * Created by Inspired Day on 7/27/2015.
 */
public class Main {
    public static void main(String[] args){
        Stack2<Integer> data = new Stack2<>();

        for(int i = 0; i < 10; i++){
            data.push(i);
        }
        data.pop();
        System.out.println(data);
    }
}
