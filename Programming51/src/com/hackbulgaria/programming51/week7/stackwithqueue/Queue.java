package com.hackbulgaria.programming51.week7.stackwithqueue;

/**
 * Created by Inspired Day on 7/27/2015.
 */
public interface Queue<T> {
    public T pop(); // removes the head and returns it
    public T peek(); // only returns the head without removing it
    public boolean isEmpty(); // returns true if empty
    public void push(T data); // pushes data into the queue
}
