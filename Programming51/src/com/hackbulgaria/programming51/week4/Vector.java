package com.hackbulgaria.programming51.week4;

/**
 * Created by Inspired Day on 6/29/2015.
 */
public class Vector <T> {
    T[] data;
    int size = 0;
    int capacity = 10;

    public Vector(){
        data = (T[]) new Object[capacity];
    }

    public void add(T s){
        if(size < capacity && size == 0){
            data[size] = s;
        }
    }

    public int getSize() {
        return size;
    }

    public T getElement(int index){
        if(size < capacity && size == 0){
            return data[index];
        }
        return null;
    }

}
