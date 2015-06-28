package com.hackbulgaria.programming51.week3;

/**
 * Created by vdimitrova on 6/25/2015.
 */
public class IntegerVectorStatic {


    public static String toString(IntegerVector v){
        return join(v, ", ");
    }

    public static String join(IntegerVector v, String glue){
        String arrString = "";
        int [] data = v.data();
        for (int i = 0; i < v.size(); i++){
            if(data[i] != data[v.size() - 1]){
                arrString += (data[i] + glue);
            } else{
                arrString += data[i];
            }
        }
        return arrString;
    }

    public static void sort(IntegerVector v){
        int [] data = v.data();
        int index = 0;
        for(int i = 0; i < v.size(); i++){
            for (int n = i; n < v.size(); i++){
                if(data[n] < data[index]){
                    index = n;
                }
            }
            int temp = data[i];
            data[i] = data[index];
            data[index] = temp;
        }
    }

    public static IntegerVector reverse(IntegerVector v){
        int [] data = v.data();
        int [] reversed = new int [v.size()];
        int index = 0;
        for (int i = v.size()-1; i >= 0; i--){
            reversed[index] = data[i];
            index++;
        }
        IntegerVector reversedV = new IntegerVector();
        reversedV.addAll(reversed);
        return reversedV;
    }

    public static IntegerVector range(int a, int b){
        IntegerVector v = new IntegerVector();
        int index = 0;
        for(int i = a; i < b; i++){
            v.add(i);
        }
        return v;
    }

    public static IntegerVector filterOdd(IntegerVector v){
        IntegerVector oddV = new IntegerVector();
        int [] vArr = v.data();
        for(int i = 0; i < v.size(); i++){
            if(vArr[i] % 2 != 0){
                oddV.add(vArr[i]);
            }
        }
        return oddV;
    }

}
