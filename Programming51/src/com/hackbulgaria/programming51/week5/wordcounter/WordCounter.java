package com.hackbulgaria.programming51.week5.wordcounter;

/**
 * Created by Inspired Day on 7/11/2015.
 */
public class WordCounter {
    private char [][] matrix;
    private String word;

    public WordCounter(char[][] matrix, String word){
        this.matrix = matrix;
        this.word = word;
    }

    public void findTheWord(){
        int wordCounter = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == word.charAt(0)){
                    wordCounter += ifWordExists(i, j);
                }
            }
        }
        System.out.println(wordCounter);
    }

    private int ifWordExists(int row, int col){
        int wordCounter = 0;
        wordCounter += checkHorizontally(row, col);
        wordCounter += checkVertically(row, col);
        return wordCounter;
    }

    private int checkHorizontally(int row, int col){
        int wordCounter = 0;
        int counter = 0;

        // -->
        if(word.length() <= matrix[row].length - col){
            for(int i = col; i < matrix[row].length - col; i++){
                if(matrix[row][i] != word.charAt(counter)){
                    break;
                }
                if(matrix[row][i] == word.charAt(word.length() - 1)){
                    wordCounter++;
                    break;
                }
                counter++;
            }
        }
        // <--
        if(word.length() <= col + 1){
            counter = 0;
            for(int i = col; i >= 0; i--){
                if(matrix[row][i] != word.charAt(counter)){
                    break;
                }
                if(matrix[row][i] == word.charAt(word.length() - 1)){
                    wordCounter++;
                    break;
                }
                counter++;
            }
        }
        return wordCounter;
    }

    private int checkVertically(int row, int col){
        int wordCounter = 0;
        int counter = 0;

        // down
        if(word.length() <= matrix.length - row){
            for(int i = row; i < matrix.length - row; i++){

                if(matrix[i][col] != word.charAt(counter)){
                    break;
                }
                if(matrix[i][col] == word.charAt(word.length() - 1)){
                    wordCounter++;
                    break;
                }
                counter++;
            }
        }
        // up
        if(word.length() <= row + 1){
            counter = 0;
            for(int i = row; i >= 0; i--){
                if(matrix[i][col] != word.charAt(counter)){
                    break;
                }
                if(matrix[i][col] == word.charAt(word.length() - 1)){
                    wordCounter++;
                    break;
                }
                counter++;
            }
        }

        return wordCounter;
    }
}
