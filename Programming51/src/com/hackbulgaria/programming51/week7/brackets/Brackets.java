package com.hackbulgaria.programming51.week7.brackets;

import com.hackbulgaria.programming51.week7.Stack;

/**
 * Created by Inspired Day on 7/22/2015.
 */
public class Brackets {
    public static boolean areCorrect(String brackets) {
        Stack<Character> data = new com.hackbulgaria.programming51.week7.Stack<>();
        for(int i = 0; i < brackets.length(); i++){
            char letter = brackets.charAt(i);
            if(letter == '{' || letter == '[' || letter == '('){
                data.push(brackets.charAt(i));
            } else {
                char temp;
                switch (letter){
                    case '}': temp = '{';
                        break;
                    case ']': temp = '[';
                        break;
                    case ')': temp = '(';
                        break;
                    default: temp = '_';
                }
                if(temp != data.peek()){
                    return false;
                }
                data.pop();
            }
        }
        return true;
    }
}