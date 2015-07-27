package com.hackbulgaria.programming51.week7.stackwithqueue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Inspired Day on 7/27/2015.
 */
public class Stack2<T> {
    private Queue<T> firstQueue = new LinkedList<T>();

    public T pop() {
        return firstQueue.poll();
    }

    public T peek() {
        return firstQueue.peek();
    }

    public boolean isEmpty() {
        return firstQueue.size() == 0;
    }

    public void push(T data) {
        Queue<T> temp = new LinkedList<>();
        temp.add(data);
        while (!isEmpty()){
            temp.add(firstQueue.poll());
        }
        firstQueue = temp;
    }

    public String toString(){
        return firstQueue.toString();
    }
}
