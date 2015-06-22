package com.hackbulgaria.programming51.week3;

/**
 * Created by Inspired Day on 6/22/2015.
 */
public class Arr {

    public static void main(String args[]){
        int[] a = {10, 20, -50, 80, 70, 66, -365};

        System.out.println("Print the array to string:");
        System.out.println(Arr.toString(a));

        System.out.println("Sort the array a itself and print it sorted:");
        Arr.sort(a);
        System.out.println(Arr.toString(a));


        System.out.println("Print the reverse of the sorted array");
        Arr.reverse(a);
        System.out.println(Arr.toString(a));

        System.out.println("Output each element in a with -> between them");
        System.out.println(Arr.join(a, "->"));

        System.out.println("Output the sum");
        System.out.println(Arr.sum(a));

        System.out.println("Output array with elements from 1 to 10");
        System.out.println(Arr.toString(Arr.range(1, 10)));

        int [] b = {2,3,4,8,9,11,13,15};
        int [] temp = Arr.filterOdd(b);
        System.out.println(Arr.join(temp, ", "));
    }

    public static String toString(int[] a){
        return Arr.join(a, ", ");
    }

    public static void sort(int [] a){
        for(int i = 0; i < a.length; i++){
            int index = i;
            for (int j = i; j < a.length; j++){
                if(a[j] < a[index]){
                    index = j;
                }
            }
            int temp = a[index];
            a[index] = a[i];
            a[i] = temp;
        }
    }

    public static int[] reverse(int[] a){
        for (int i = 0; i <= a.length /2; i++){
            int lastArg = a.length - i - 1;
            int temp = a[i];
            a[i] = a[lastArg];
            a[lastArg] = temp;
           /* System.out.println(i);
            System.out.println(a.length - i - 1);*/
        }
        return a;
    }

    public static String join(int[] a, String glue){
        String arrString = "";
        for (int item:a){
            if(item != a[a.length - 1]){
                arrString += (item + glue);
            } else{
                arrString += item;
            }
        }
        return arrString;
    }

    public static int sum(int[] a){
        int sum = 0;
        for (int item:a){
            sum += item;
        }
        return sum;
    }

    public static int[] range(int a, int b){
        int [] rangeArr = new int [b - a];
        for (int i = 0; i < rangeArr.length; i++){
            rangeArr[i] = a + i;
        }
        return rangeArr;
    }

    public static int[] filterOdd(int[] a){
        int counter = 0;
        for(int item:a){
            if (item % 2 != 0){
                counter += 1;
            }
        }
        int [] oddNumsArr = new int [counter];
        int j = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] % 2 != 0){
                oddNumsArr[j] = a[i];
                j++;
            }
        }
        System.out.println(counter);
        return oddNumsArr;
    }



}
