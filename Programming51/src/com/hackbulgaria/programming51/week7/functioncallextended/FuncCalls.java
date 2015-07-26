package com.hackbulgaria.programming51.week7.functioncallextended;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by Inspired Day on 7/24/2015.
 */
public class FuncCalls {
    public LinkedList<Function> functions;

    public FuncCalls(){
        this.functions = new LinkedList<>();
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\n"); // Changing the delimiter to accept and undrestand new lines
        FuncCalls funcData = new FuncCalls();

        int funcsNum = scanner.nextInt();
        String[] funcs = new String[funcsNum];
        for(int i = 0; i < funcs.length; i++){
            funcs[i] = scanner.next();
            funcData.addFunc(funcs[i]);
        }
        String newFunc = scanner.next();
        int x = scanner.nextInt();

        int finalResult = funcData.evaluate(newFunc, x);
        System.out.println(finalResult);
    }

    public void addFunc(String func){
        String arr[] = func.split("=", 2);
        String name = arr[0].substring(0, func.indexOf(' '));
        String body =  arr[1];
        Function inputFunc = new Function(name, body);
        functions.add(inputFunc);
    }

    public int evaluate(String formula, int x) {
        int result = 0;
        String[] names = formula.split(" . ", funcCallsCount(formula));

        for(int i = names.length - 1; i >= 0; i--){
            result = findFuncResult(names[i], x);
            x = result;
        }
        return result;
    }

    private int findFuncResult(String f, int x){
        int result = 0;
        int size = functions.size();
        for(int i = 0; i < size; i++){
            if(functions.get(i).getName().equals(f)){
                result = calculate(functions.get(i).getBody().trim(), x);
            }
        }
        return result;
    }

    private int funcCallsCount(String formula){
        int funcCounter = 1;
        for(int i = 0; i < formula.length(); i++){
            if(formula.charAt(i) == '.'){
                funcCounter++;
            }
        }
        return funcCounter;
    }

    private int calculate(String body, int x) {
        boolean plus = false;
        int result = 0;
        int counter = 0;
        for(String word:body.split(" ")){
            boolean signs =  word.matches("\\+") || word.matches("-");
            if( (counter == 0 && !signs && word.matches("^\\d+$") || word.equals("x")) ){
                result = findTheString(word, x);
            } else {
                if(signs){
                    plus = word.matches("\\+");
                } else {
                    if(plus){
                        result += findTheString(word, x);
                    } else {
                        result -= findTheString(word, x);
                    }
                }
            }
        }
        return result;
    }

    private int findTheString(String word, int x){
        int result = 0;
        int xParameter = x;
        if(word.equals("x")){
            result = x;
        } else if(word.matches("^\\d+$")) {
            result = Integer.parseInt(word);
        } else {
            // If the function has different parameter from x
            if(!word.split("\\(")[1].contains("x")){
                xParameter = Integer.parseInt( word.split("\\(")[1].split("\\)")[0]);
            }
            result = findFuncResult(word.split("\\(")[0], xParameter);
            xParameter = x; // reset the xParameter, because it's different only for this function
        }
        return result;
    }

}
