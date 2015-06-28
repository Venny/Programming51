/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackbulgaria.programming51.week3;

/**
 * @author vdimitrova
 */
public class IntegerVector {
    private int[] integerData;
    private int currentSize;
    private int capacity;

    public IntegerVector() {
        this.capacity = 10;
        this.currentSize = 0;
        this.integerData = new int[capacity];
    }


    public String toString() {
        String data = "";
        for (int i = 0; i < currentSize; i++) {
            data += (integerData[i] + " ");
        }
        return data;
    }

    public void add(int e) {
        if (currentSize == capacity) {
            resize();
        }

        integerData[currentSize] = e;
        currentSize++;
    }

    public int size() {
        return currentSize;
    }

    public int [] data(){
        return integerData;
    }


    public int sum() {
        int sum = 0;
        for (int i = 0; i < currentSize; i++){
             sum += integerData[i];
        }
        return sum;
    }

    public void addAll(int [] n){
        for(int i = 0; i < n.length; i++){
            add(n[i]);
        }
    }



    public int get(int index){
        return integerData[index];
    }

    public void insert(int index, int data){
        int temp = integerData[index];
        integerData[index] = data;
        add(temp);
    }

    public void remove(int index){
        if(index < currentSize && index >= 0){
            for(int i = index; i < currentSize - 1; i++){
                integerData[i] = integerData[i + 1];
            }
            currentSize--;
        }
    }

    private void resize() {
        capacity = capacity * 2 + 1;
        int[] temp = new int[capacity];
        for (int i = 0; i < currentSize; i++) {
            temp[i] = integerData[i];
        }
        integerData = temp;
    }
}
