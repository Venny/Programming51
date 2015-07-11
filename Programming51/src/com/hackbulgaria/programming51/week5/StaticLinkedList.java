package com.hackbulgaria.programming51.week5;

/**
 * Created by Inspired Day on 7/8/2015.
 */
public class StaticLinkedList {
    public static LinkedList<Integer> reverse(LinkedList<Integer> l) {
        LinkedList<Integer> temp = new LinkedList<>();
        int size = l.size() - 1;
        // Reverses the list
        for(int i = size; i >= 0; i--){
            temp.add(l.get(i));
        }
        return temp;
    }


    public static LinkedList<Integer> sort(LinkedList<Integer> l) {
        // Sorts the list
        LinkedList<Integer> temp = l;
        int size = l.size();
        int index = 0;
        for(int i = 0; i < size; i++){
            index = i;
            for(int n = i; n < size; n++) {
                if (temp.get(n) > temp.get(index)) {
                    index = n;
                }
            }
            int tempInt = temp.get(i);
            temp.set(i, temp.get(index));
            temp.set(index, tempInt);
        }
        return temp;
    }

    public static LinkedList<Integer> merge(LinkedList<Integer> a, LinkedList<Integer> b) {
        // Merges a and b into one sorted list
        LinkedList<Integer> temp = a;
        int sizeB = b.size();
        for (int i = 0; i < sizeB; i++){
            temp.add(b.get(i));
        }

        return sort(temp);
    }
}
