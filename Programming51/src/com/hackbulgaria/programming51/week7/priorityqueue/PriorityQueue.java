package com.hackbulgaria.programming51.week7.priorityqueue;

import com.hackbulgaria.programming51.week7.DataStructure;

import java.util.LinkedList;

/**
 * Created by Inspired Day on 7/28/2015.
 */
public class PriorityQueue implements DataStructure<Integer>{
    private LinkedList<Integer> data;

    public PriorityQueue(){
        this.data = new LinkedList<>();
    }

    public void push(Integer data) {

    }

    public Integer pop(){
       return 0;
    };

    public Integer peek(){
        return 0;
    };

    public boolean isEmpty(){
        return data == null;
    };

}
