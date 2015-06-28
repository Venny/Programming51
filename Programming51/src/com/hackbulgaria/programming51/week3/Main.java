package com.hackbulgaria.programming51.week3;

/**
 * Created by Inspired Day on 6/28/2015.
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IntegerVector v = new IntegerVector();
        for (int i = 1; i < 20; i++) {
            v.add(i);
        }
        System.out.println(v);
        v.add(50);

        System.out.println(v.size());
        System.out.println(v.sum());

        int [] b = new int[10];
        for (int i = 1; i < 10; i++) {
            b[i] = i;
        }
        v.addAll(b);
        System.out.println(v);

        System.out.println(v.get(3));
        System.out.println(v.get(9));

        IntegerVector c = new IntegerVector();
        for (int i = 1; i < 10; i++) {
            c.add(i);
        }
        System.out.println("Arr c: " + c);
        c.insert(3, 10);
        System.out.println(c);

        c.remove(3);
        System.out.println(c);


        int [] a = {1,2,3,4,5};
        IntegerVector vector = new IntegerVector();
        vector.addAll(a);
        /*System.out.println(IntegerVectorStatic.toString(vector));

        IntegerVectorStatic.sort(v);
        System.out.println(IntegerVectorStatic.toString(v));*/

        IntegerVector temp = IntegerVectorStatic.reverse(vector);
        System.out.println(IntegerVectorStatic.toString(temp));

        IntegerVector e = new IntegerVector();
        e = IntegerVectorStatic.range(10,20);
        System.out.println(IntegerVectorStatic.toString(e));
        IntegerVector temp2 = IntegerVectorStatic.filterOdd(e);
        System.out.println("Odd: " + temp2);
    }
}
