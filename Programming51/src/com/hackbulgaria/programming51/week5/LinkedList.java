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
        if(index > 0){
            insertAfter(index - 1, el);
        } else {
            Node<T> newEl = new Node<>(el);
            Node <T> headEl = head;
            head = newEl;
            newEl.setNext(headEl);
        }
    }

    public void insertAfter(int index, T el){
        Node<T> newEl = new Node<>(el);
        Node<T> previousEL = findElementByIndex(index);
        newEl.setNext(previousEL.getNext());
        previousEL.setNext(newEl);
    }

    public String toString(){
        String str = "[";
        Node<T> temp = head;
        while(temp.getNext() != null){
            str += temp.getData() + ", ";
            temp = temp.getNext();
        }

        return str += temp.getData() + "]";
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
        return temp >= 0;
    }

    public int getElementIndex(T data) {
        // Returns the index of the specified element
        return findElementByData(data);
    }

    public int size() {
        // Returns the size of the list
        Node<T> temp = head;
        int counter = 1;
        while(true){
            if(temp.getNext() == null){
                return counter;
            } else{
                temp = temp.getNext();
                counter++;
            }
        }
    }

    public T[] toArray(T[] arr) {
        // Returns an array with all the elements in the list
        int listSize = size();
        Node<T> temp = head;
        for(int i = 0; i < arr.length; i++){
            arr[i] = temp.getData();
            temp = temp.getNext();
        }
        return arr;
    }

    public void addArray(T[] arr) {
        // Appends the array at the end of the list
        for(int i = 0; i < arr.length; i++){
            add(arr[i]);
        }
    }
    public void clear(){
        head = null;
        tail = null;
    }
    public void insertListBefore(int index, LinkedList<T> l){
        // Inserts all the elements of l before the index element
        int lSize = l.size();
        for (int i = 0; i <lSize; i++){
            insert(index, l.get(i));
            index++;
        }
    }
    public void insertListAfter(int index, LinkedList<T> l) {
        // Inserts all the elements of l after the index element
        insertListBefore(index + 1, l);
    }

    private Node<T> findElementByIndex(int index){
        Node<T> temp = head;
        int counter = 0;
        while(counter <= index){
            if(counter == index){
                return temp;
            } else{
                temp = temp.getNext();
                counter++;
            }
        }
        return null;
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
