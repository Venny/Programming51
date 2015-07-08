package com.hackbulgaria.programming51.week5;

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
        return findElementByIndex(index).getData();
    }

    public void set(int index, T el){
        // Set the value at the index place
        findElementByIndex(index).setData(el);
    }

    public void remove(int index){
        // Remove an element form the index place
        Node<T> nextEl = findElementByIndex(index + 1);
        if(nextEl != null){
            findElementByIndex(index - 1).setNext(findElementByIndex(index + 1));
        } else {
            System.out.println("Doesn't exist.");
        }
    }

    public void insert(int index, T el){
        // Insert an element on the index place
        insertAfter(index - 1, el);
    }

    public void insertAfter(int index, T el){
        Node<T> newEl = new Node<>(el);
        Node<T> previousEL = findElementByIndex(index);
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

    public void addFirst(T data){
        Node<T> temp = new Node<>(data);
        temp.setNext(head);
        head = temp;
        if(tail == null){
            tail = head;
        }
    }

    public void addLast(T data) {
        // Insert data at the end of the list
        add(data);
    }

    public T getFirst() {
        // Return the first element of the list
        return head.getData();
    }

    public T getLast() {
        // Return the last element of the list
        return tail.getData();
    }

    public boolean contains(T data) {
        // Returns true if the list contains the element
        int temp = findElementByData(data);
        if( temp < 0 ){
            return false;
        }
        return true;
    }

    public int getElementIndex(T data) {
        // Returns the index of the specified element
        return findElementByData(data);
    }

    public int size() {
        // Returns the size of the list
        return -1;
    }

    private Node<T> findElementByIndex(int index){
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

    private int findElementByData(T data){
        Node<T> temp = head;
        int counter = 0;
        while(true){
            if(temp.getData() == data){
                return counter;
            } else{
                temp = temp.getNext();
                counter++;
                if(temp.getNext() == null){
                    return -1;
                }
            }
        }
    }

}
