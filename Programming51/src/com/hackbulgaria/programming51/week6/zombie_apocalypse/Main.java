package com.hackbulgaria.programming51.week6.zombie_apocalypse;

import java.util.Scanner;

/**
 * Created by Inspired Day on 7/15/2015.
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int zombieHealth = scanner.nextInt();
        String weapon = scanner.next();
        System.out.println(n + " " + zombieHealth + " " + weapon);


    }
}
