package com.hackbulgaria.programming51.week4;

import java.util.Scanner;

/**
 * Created by Inspired Day on 7/1/2015.
 */
public class BirthdayRanges {
    public static Vector<Integer> birthdaysCount(Vector<Integer> birthdays, Vector<IntPair> ranges) {
        Vector<Integer> birthdaysCount = new Vector<Integer>();
        int counter = 0;

        for (int i = 0; i < ranges.getSize(); i++){
            for (int n = 0; n < birthdays.getSize(); n++){
                if(birthdays.getElement(n).intValue() >= ranges.getElement(i).start && birthdays.getElement(n).intValue() <= ranges.getElement(i).end ){
                    counter++;
                }
            }
            birthdaysCount.add(counter);
            counter = 0;
        }

        return birthdaysCount;
    }

    public static void main(String[] args) {
        Vector<Integer> birthdays = new Vector<Integer>();
        Vector<IntPair> ranges = new Vector<IntPair>();

        Scanner scanner = new Scanner(System.in);

        int bdaysCount = scanner.nextInt();

        for(int i = 0; i < bdaysCount; i++) {
            birthdays.add(scanner.nextInt());
        }

        int rangesCount = scanner.nextInt();

        for(int i = 0; i < rangesCount; i ++) {
            IntPair pair = new IntPair();

            pair.start = scanner.nextInt();
            pair.end = scanner.nextInt();

            ranges.add(pair);
        }

        System.out.println("Result is:");
        Vector<Integer> result = birthdaysCount(birthdays, ranges);

        for(int count = 0; count < result.getSize(); count++ ) {
            System.out.print(result.getElement(count).intValue());
            System.out.print(", ");
        }
    }
}
