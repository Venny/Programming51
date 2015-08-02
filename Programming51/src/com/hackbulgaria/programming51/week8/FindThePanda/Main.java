package com.hackbulgaria.programming51.week8.FindThePanda;

import java.util.Scanner;

/**
 * Created by Inspired Day on 7/30/2015.
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        String temp = "";
        char[][] map = new char[x][y];

        for (int i = 0; i < x; i++){
            temp =  scanner.next();
            for(int n = 0; n < y; n++){
                map[i][n] = temp.charAt(n);
            }
        }
        Maze newMaze = new Maze(map);
        System.out.println(newMaze.findThePanda());

    }
}
