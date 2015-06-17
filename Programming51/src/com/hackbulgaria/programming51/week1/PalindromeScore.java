package com.hackbulgaria.programming51.week1;

import java.util.Scanner;

public class PalindromeScore {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int reversed = reverse(n);
        boolean palindrome = (reverse(n) == n);
        int p = n;
        int num = 1;

        while(!palindrome){
            p = num + (n + reversed);
            palindrome = (reverse(p) == p);
            num++;
        }
        System.out.println("The n score is: " + p);
    }

    public static int reverse(int m) {
        int reversedNum = 0;

        while (m != 0) {
            reversedNum = reversedNum * 10 + m % 10;
            m /= 10;
        }

        return reversedNum;
    }

}

