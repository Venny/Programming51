package com.hackbulgaria.programming51.week1;

import java.util.Scanner;

public class Binary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String binary = toBinary(n);
        System.out.println(countBits(n));
    }

    public static String toBinary(int n) {
        String binary;
        for(binary = ""; n >= 1; n /= 2) {
            if(n % 2 == 1) {
                binary = "1" + binary;
            } else {
                binary = "0" + binary;
            }
        }

        return binary;
    }

    public static int toNumber(String binary) {
        int num = 0;
        int index = 0;
        System.out.println("binary: " + binary);

        for(int i = binary.length() - 1; i >= 0; --i) {
            if(binary.charAt(i) == 49) {
                num = (int)((double)num + Math.pow(2.0D, (double)index));
            }

            ++index;
        }

        return num;
    }

    public static int countBits(int n) {
        String nBinary = toBinary(n);
        return nBinary.length();
    }

    /*public static boolean isPowerOfTwo(String binary){

    }*/
}