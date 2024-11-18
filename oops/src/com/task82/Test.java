package com.task82;

public class Test {
    public static void main(String[] args) {
        ArrayOperations a = new ArrayOperations(new double[]{1,2,3,4,5,6});
        ArrayOperations.Statistics s = a.new Statistics();
        System.out.println(s.mean(a.arr));

    }
}
