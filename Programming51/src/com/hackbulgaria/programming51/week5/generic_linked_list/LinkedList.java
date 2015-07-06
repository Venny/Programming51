package com.hackbulgaria.programming51.week5.generic_linked_list;

/**
 * Created by Inspired Day on 7/6/2015.
 */
public class LinkedList <T> {
    private Node<T> head;
    private Node<T> tail;

    public LinkedList(){
        this.head = null;
        this.tail = null;
    }

    public void add(T el){
        Node<T> temp = new Node<T>(el);
        if(head == null){
            head = temp;
            tail = temp;
        } else {
            tail.setNext(temp);
            tail = temp;
        }
    }

    public T get(int index){
        return findElement(index).getData();
    }

    public void set(int index, T el){
        // Set the value at the index place
        findElement(index).setData(el);
    }

    public void remove(int index){
        // Remove an element form the index place
        Node<T> nextEl = findElement(index + 1);
        if(nextEl != null){
            findElement(index - 1).setNext(findElement(index + 1));
        } else {
            System.out.println("Doesn't exist.");
        }
    }

    public void insert(int index, T el){
        // Insert an element on the index place
        Node<T> newEl = new Node<>(el);
        Node<T> previousEL = findElement(index - 1);
        newEl.setNext(previousEL.getNext());
        previousEL.setNext(newEl);
    }

    public String toString(){
        String str = "";
        Node<T> temp = head;
        while(temp.getNext() != null){
            str += temp.getData() + " ";
            temp = temp.getNext();
        }

        return str += temp.getData();
    }

    private Node<T> findElement(int index){
        Node<T> temp = head;
        int counter = 0;
        while(true){
            if(counter == index){
                return temp;
            } else{
                temp = temp.getNext();
                counter++;
            }
        }
    }

}
