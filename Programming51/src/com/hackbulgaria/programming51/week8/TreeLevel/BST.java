package com.hackbulgaria.programming51.week8.TreeLevel;

import java.util.LinkedList;

/**
 * Created by Inspired Day on 7/29/2015.
 */
public class BST <T extends Comparable<T>> {
    private Node<T> root;
    private int height;

    public BST() {
        root = null;
        height = 0;
    }

    public boolean empty() {
        return root == null;
    }

    public void add(T data) {
        if(empty()) {
            root = new Node<T>(data); // Случай че дървото е празно
        } else {
            if(data.compareTo(root.data) < 0 ){
                // Добавяме в ляво
                if(root.left == null) {
                    root.left = new Node<T>(data);
                } else {
                    addRecursive(data, root.left);
                }
            } else {
                // Добавяме в дясно
                if(root.right == null) {
                    root.right = new Node<T>(data);
                } else {
                    addRecursive(data, root.right);
                }
            }
        }
    }

    private void addRecursive(T data, Node<T> root) {
        if(data.compareTo(root.data) < 0) { // Проверка дали data е по-малко
            // Ще добавяме в ляво
            if(root.left == null) {
                root.left = new Node<T>(data);
            } else {
                addRecursive(data, root.left);// Добавяме в лявото поддърво
            }
        } else {
            // Ще добавяме в дясно
            if(root.right == null) {
                root.right = new Node<T>(data);
            } else {
                addRecursive(data, root.right); // Добавяме в дясното поддърво
            }
        }
    }

    private String toStringRecursive(Node<T> root) {
        if(root == null) return "";
        String str = "";
        str += toStringRecursive(root.left);
        str += root.data + " ";
        str += toStringRecursive(root.right);
        return str;
    }

    public String toString() {
        String str = "";
        str += toStringRecursive(root);
        return str;
    }

    public int getTreeHeight(){
        getTreeHeightRecursive(root, 0);
        return height;
    }

    public LinkedList<T> getTreeLevel(int level){
        LinkedList lastNums = new LinkedList<>();
        getTreeLevelRecursive(lastNums, root, level, 1);
        return lastNums;
    }

    private void getTreeHeightRecursive(Node<T> data, int index){
        if(data.left != null){
            getTreeHeightRecursive(data.left, height += 1);
        } else if(data.right != null){
            getTreeHeightRecursive(data.right, height += 1);
        }
    }

    private void getTreeLevelRecursive(LinkedList<T> lastNums, Node<T> node, int level, int current){
        if(node == null) return;
            if(level == current){
                lastNums.add(node.data);
            } else {
                System.out.println(node.data);
                getTreeLevelRecursive(lastNums, node.left, level, current + 1);
                getTreeLevelRecursive(lastNums, node.right, level, current + 1);
            }
    }

    public void printLevel(int level) {
        printLevelRecursive(level, root, 1);
    }

    private void printLevelRecursive(int level, Node<T> root, int counter) {
        if (root == null) {
            return;
        }
        if (level == counter) {
            System.out.print(root.data + " ");
        } else {
            printLevelRecursive(level, root.left, counter + 1);
            printLevelRecursive(level, root.right, counter + 1);
        }
    }
}
