package com.hackbulgaria.programming51.week7;

/**
 * Created by Inspired Day on 7/29/2015.
 */
public interface DataStructure <E> {
    public void push(E data);
    public E pop();
    public E peek();
    public boolean isEmpty();
}
