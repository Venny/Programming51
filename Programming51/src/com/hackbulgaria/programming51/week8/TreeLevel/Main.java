package com.hackbulgaria.programming51.week8.TreeLevel;

import javax.sound.midi.Soundbank;

/**
 * Created by Inspired Day on 7/29/2015.
 */
public class Main {
    public static void main(String[] args){
        BST<Integer> tree = new BST<>();

        /*for(int i = -2; i <= 10; i++){
            tree.add(i);
        }*/
        tree.add(5);
        tree.add(3);
        tree.add(7);
        tree.add(1);
        tree.add(2);
        tree.add(10);

        //System.out.println(tree.toString());
        System.out.println(tree.getTreeHeight());
        System.out.println(tree.getTreeLevel(2));
        tree.printLevel(2);
    }
}
