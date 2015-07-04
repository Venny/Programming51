package com.hackbulgaria.programming51.week4;

import java.util.Scanner;

/**
 * Created by Inspired Day on 7/3/2015.
 */
public class StringNormalizer {
    public static String normalizeString(String str) {
        String[] words = str.toUpperCase().trim().replaceAll(" +", " ").split(" ");
        String temp = "";
        for(String w:words){
            w = w.replace(w.substring(1), w.substring(1).toLowerCase());
            temp += w + " ";
        }
        return temp.trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(normalizeString(s));
    }

}
