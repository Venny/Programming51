package com.hackbulgaria.programming51.week8.TreeLevel;

/**
 * Created by Inspired Day on 7/29/2015.
 */
public class Node<T> {
    public T data;
    public Node<T> left;
    public Node<T> right;

    public Node(T data) {
        this.data = data;
        left = null;
        right = null;
    }
}
