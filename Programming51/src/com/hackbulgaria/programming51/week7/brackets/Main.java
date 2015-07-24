package com.hackbulgaria.programming51.week7.brackets;

import java.util.Scanner;

/**
 * Created by Inspired Day on 7/22/2015.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String brackets = scanner.next();
        System.out.println(Brackets.areCorrect(brackets));
    }
}
