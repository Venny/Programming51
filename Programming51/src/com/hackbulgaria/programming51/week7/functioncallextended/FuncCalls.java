package com.hackbulgaria.programming51.week7.functioncallextended;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

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
        FuncCalls funcStask = new FuncCalls();

        int funcsNum = scanner.nextInt();
        String[] funcs = new String[funcsNum];
        for(int i = 0; i < funcs.length; i++){
            funcs[i] = scanner.next();
            funcStask.addFunc(funcs[i]);
        }
        String newFunc = scanner.next();
        int x = scanner.nextInt();

        funcStask.evaluate(newFunc, x);
    }

    public void addFunc(String func){
        String arr[] = func.split("=", 2);
        String name = arr[0].substring(0, func.indexOf(' '));
        String body =  arr[1];
        Function inputFunc = new Function(name, body);
        functions.add(inputFunc);
    }

    public int evaluate(String formula, int x) {
        Stack<String> funcsNames = new Stack<>();
        int result = 0;
        int funcCounter = funcCallsCount(formula);
        String[] names = formula.split(" . ", funcCounter);

        for (int i = 0; i < names.length; i++){
            funcsNames.push(names[i]);
        }
        /*while(!(funcsNames.size() == 0)){
            //result = findFuncResult(funcs.peek(), x);
            funcsNames.pop();
            x = result;
        }*/

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

}
