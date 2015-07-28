package com.hackbulgaria.programming51.week7.positivenegative;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Inspired Day on 7/27/2015.
 */
public class PositivesAndNegatives {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }

        Stack<Integer> result = reorder(arr);

        while(!result.isEmpty()) {
            System.out.println(result.pop());
        }
    }

    public static Stack<Integer> reorder(int[] numbers) {
        Stack<Integer> result = new Stack<>();
        int index = 0;
        for (int i = 0; i < numbers.length; i++){
            for (int n = i; n < numbers.length; n++){
                if(numbers[n] < numbers[index] && numbers[n] >= 0){
                    index = n;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[index];
            numbers[index] = temp;
        }

        return result;
    }

    private static Stack<Integer> orderedStack(int[] orderedNums){
        Stack<Integer> result = new Stack<>();
        for(int i = 0; i < orderedNums.length; i++){
            if(orderedNums[i] < 0){

            }
        }
        return result;
    }
}
