package com.hackbulgaria.programming51.week4;

/**
 * Created by Inspired Day on 6/29/2015.
 */
public class Vector <T> {
    private T[] data;
    private int size = 0;
    private int capacity = 10;

    public Vector(){
        data = (T[]) new Object[capacity];
    }

    public String toString(){
        String temp = "";
        for(int i = 0; i < getSize(); i++){
            temp += data[i] + " ";
        }
        return temp;
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

    public void switchPlaces(int index, int index2){
        T temp = data[index];
        data[index] = data[index2];
        data[index2] = temp;
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
