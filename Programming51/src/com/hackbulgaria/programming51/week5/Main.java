package com.hackbulgaria.programming51.week5;

import java.util.Scanner;

/**
 * Created by Inspired Day on 7/6/2015.
 */
public class Main {

    public static void main(String[] args){
/*        LinkedList<Integer> l = new LinkedList<>();
        for (int i = 10; i < 20; i++) {
            l.add(i);
        }
        l.insert(2, 5);
        l.remove(1);
        //System.out.println(l);*/

        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> l = new LinkedList<>();
        int n;
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            l.addLast(scanner.nextInt());
        }

        l.insertAfter(3,scanner.nextInt());

        l.remove(2);

        l.addFirst(scanner.nextInt());

        int x = scanner.nextInt();

        System.out.println(l.contains(x));
        System.out.println(l.getFirst() + " " + l.getLast());
        System.out.println(l);

    }
}