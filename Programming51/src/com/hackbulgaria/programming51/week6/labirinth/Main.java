package com.hackbulgaria.programming51.week6.labirinth;

import java.util.Scanner;

/**
 * Created by Inspired Day on 7/19/2015.
 */
public class Main {
    public static void main(String args[]){
        char[][] data ={{'#','#','#','#','#','#','#','#'},
                        {'#','X','.','#','.','.','.','#'},
                        {'#','.','.','.','.','#','.','#'},
                        {'#','.','.','#','.','.','.','#'},
                        {'#','#','.','.','.','.','#','#'},
                        {'#','.','.','.','#','.','.','#'},
                        {'#','#','#','#','#','#','!','#'}};

        Labirinth firstLevel = new Labirinth(data);
        Scanner scanner = new Scanner(System.in);

        while(!firstLevel.getSuccess()){
            firstLevel.print();
            System.out.println("Make your move: ");
            Movement personMovement;
            String move = scanner.next().toLowerCase();
            switch (move){
                case "right": personMovement = new MoveRight();
                    break;
                case "left": personMovement = new MoveLeft();
                    break;
                case "up": personMovement = new MoveUp();
                    break;
                case "down": personMovement = new MoveDown();
                    break;
                default:
                    System.out.println("Unknown move!");
                    return;
            }
            firstLevel.movePerson(personMovement);
        }
        firstLevel.print();
        System.out.println("Congrats! You made it!");

    }
}
