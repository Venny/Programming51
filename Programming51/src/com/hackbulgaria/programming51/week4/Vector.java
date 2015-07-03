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
        if(size == capacity){
            resize();
        }
        data[size] = s;
        size++;
    }

    public int getSize() {
        return size;
    }

    public T getElement(int index){
        if(size < capacity){
            return data[index];
        }
        return null;
    }

    private void resize() {
        capacity = capacity * 2 + 1;
        T [] temp = (T[]) new Object[capacity];
        for (int i = 0; i < size; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

}
