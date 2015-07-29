package com.hackbulgaria.programming51.week7.priorityqueue;

/**
 * Created by Inspired Day on 7/28/2015.
 */
public class Main {

    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue();
        queue.push(60);
        queue.push(75);
        queue.push(85);
        queue.push(50);
        queue.push(56);

        System.out.println(queue.pop()); // 85
        System.out.println(queue.pop()); // 75
        System.out.println(queue.pop()); // 60
    }
}
