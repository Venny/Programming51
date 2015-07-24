package com.hackbulgaria.programming51.week7.functioncalls;

import java.util.Scanner;

/**
 * Created by Inspired Day on 7/23/2015.
 */
public class Parser {
    public static int evaluate(String formula, int x) {
        // implementation
        return x;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int x = scanner.nextInt();

        System.out.println(evaluate(input, x));
    }
}
