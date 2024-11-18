package com.functionalProgramming.onezerosix;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class LambdaTest {
    public static void main(String[] args) {
        BinaryOperator<Integer> mul = ( a, b)-> a*b;
        System.out.println(mul.apply(2,3));
    }
}
