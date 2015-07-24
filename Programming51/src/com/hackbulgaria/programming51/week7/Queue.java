package com.hackbulgaria.programming51.week7;


import java.util.LinkedList;

/**
 * Created by Inspired Day on 7/22/2015.
 */
public class Queue<T> {
    private LinkedList<T> data;

    public Queue(){
        this.data = new LinkedList<>();
    }

    public void push(T element){
        data.add(element);
    }

    public void pop(){
        data.removeFirst();
    }

    public int size(){
        return data.size();
    }

    public T peek(){
        return data.getFirst();
    }

}
