package com.hackbulgaria.programming51.week7;


import java.util.LinkedList;

/**
 * Created by Inspired Day on 7/22/2015.
 */
public class Queue<T> implements DataStructure<T> {
    private LinkedList<T> data;

    public Queue(){
        this.data = new LinkedList<>();
    }

    public void push(T element){
        data.add(element);
    }

    public T pop(){
        return data.removeFirst();
    }

    public int size(){
        return data.size();
    }

    public T peek(){
        return data.getFirst();
    }

    @Override
    public boolean isEmpty() {
        return data.size() == 0;
    }

}
