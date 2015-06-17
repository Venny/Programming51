package com.hackbulgaria.programming51.week1;

import java.util.Scanner;

public class IntegerPalindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean palindrome = (reverseNum(n) == n);

        if (palindrome) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

    public static int reverseNum(int m) {
        int reversed = 0;

        while (m != 0) {
            reversed = reversed * 10 + m % 10;
            m /= 10;
        }

        return reversed;

    }

}
