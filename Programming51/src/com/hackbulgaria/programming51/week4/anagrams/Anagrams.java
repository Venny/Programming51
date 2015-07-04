package com.hackbulgaria.programming51.week4.anagrams;

/**
 * Created by Inspired Day on 7/4/2015.
 */
import java.util.Scanner;

public class Anagrams {

    public static boolean areAnagrams(String a, String b) {
        boolean letterExists = false;
        a = a.toLowerCase();
        b = b.toLowerCase();
        if(a.length() != b.length()){
            return false;
        }
        for(int i = 0; i < a.length(); i++){
            for(int n = 0; n < a.length(); n++ ){
                if(a.charAt(i) == b.charAt(n)){
                    letterExists = true;
                    break;
                }
            }
            if(!letterExists){
                return false;
            }
            letterExists = false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String b = scanner.next();

        if (areAnagrams(a, b)) {
            System.out.println("ANAGRAMS");
        } else {
            System.out.println("NOT ANAGRAMS");
        }
    }
}
