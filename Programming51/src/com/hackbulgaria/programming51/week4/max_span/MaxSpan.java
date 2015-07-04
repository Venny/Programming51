package com.hackbulgaria.programming51.week4.max_span;

/**
 * Created by Inspired Day on 7/4/2015.
 */
import java.util.Scanner;

public class MaxSpan {

    public static int maxSpan(int[] numbers) {
        int span = 0;
        int maxSpan = 0;

        for(int i = 0; i < numbers.length; i++ ){
            for(int n = i; n < numbers.length; n++){
                System.out.println(n);
                if(numbers[i] == numbers[n]){
                    span = n - i + 1;
                    if(span > maxSpan){
                        maxSpan = span;
                    }
                }
            }
        }

        return maxSpan;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for(int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        maxSpan(numbers);
       // System.out.println(maxSpan(numbers));
    }

}