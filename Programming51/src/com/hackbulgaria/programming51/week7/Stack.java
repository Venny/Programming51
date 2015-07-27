package com.hackbulgaria.programming51.week7;

import java.util.LinkedList;

/**
 * Created by Inspired Day on 7/22/2015.
 */
public class Stack <E> {
    private LinkedList<E> data;

    public Stack(){
        this.data = new LinkedList<>();
    }

    public void push(E element){
        data.addFirst(element);
    }

    public void pop(){
        data.removeFirst();
    }

    public int size(){
        return data.size();
    }

    public E peek(){
        return data.getFirst();
    }

    public String toString(){
        return data.toString();
    }

    public boolean empty() {
        return data.size() == 0;
    }
}
