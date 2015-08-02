package com.hackbulgaria.programming51.week8.FindThePanda;

import java.util.Scanner;

/**
 * Created by Inspired Day on 7/31/2015.
 */
public class Maze {
    private char[][] maze;
    private int[] start;
    private Boolean pandaPath = false;

    public Maze(char[][] maze){
        this.maze = maze;
        this.start = findStartPosition();
    }

    private int[] findStartPosition(){
        int[] start = new int[2];
        for(int i = 0; i <= maze.length; i++){
            for(int n = 0; n < maze[i].length; n++){
                if(maze[i][n] == 'U'){
                    start[0] = i;
                    start[1] = n;
                    return start;
                }
            }
        }
        return start;
    }

    public boolean findThePanda(){
        findThePandaRecursive(start[0], start[1]);
        return pandaPath;
    }

    private void findThePandaRecursive(int x, int y) {
        if( !(0 <= x && x < maze.length && y >= 0 && y < maze[0].length)){return;}
        if(maze[x][y] == '#' || maze[x][y] == 'Y') return;
        if( checkForPanda(x - 1, y) || checkForPanda(x + 1, y) ){
            pandaPath = true;
            return;
        } else {
            findThePandaRecursive(x - 1, y);
            findThePandaRecursive(x + 1, y);
        }
        if(checkForPanda(x, y - 1) || checkForPanda(x, y + 1)){
            pandaPath = true;
            return;
        } else {
            findThePandaRecursive(x, y + 1);
            findThePandaRecursive(x, y - 1);
        }
    }

    private boolean checkForPanda(int x, int y){
        if( 0 <= x && x < maze.length && y >= 0 && y < maze[0].length){
            switch (maze[x][y]){
                case '.': maze[x][y] = 'U';
                    break;
                case 'U': maze[x][y] = 'Y';
                    break;
                case 'P': return true;
                default: ;
            }
        }
        return false;
    }
}
