package com.functionalProgramming.oneeleven;

import java.util.stream.IntStream;

public class Fact2ways {
    public static void main(String[] args) {

        int x = fact(5);
        System.out.println(x);

        IntStream.rangeClosed(2,5).reduce((a,b)->a*b).ifPresent(System.out::println);

    }
    public static int fact(int n){
        if(n==1) return 1;
        return n*fact(n-1);
    }
}
