package com.hackbulgaria.programming51.week5.generic_linked_list;

/**
 * Created by Inspired Day on 7/6/2015.
 */
public class Node<T> {
    private T data;
    private Node<T> next;

    public Node(T data){
        this.data = data;
        this.next = null;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
