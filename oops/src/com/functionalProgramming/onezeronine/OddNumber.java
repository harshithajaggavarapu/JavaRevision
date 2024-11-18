package com.functionalProgramming.onezeronine;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class OddNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Stream<Integer> l = list.stream().filter(x->x%2==1);
        l.forEach(i-> System.out.println(i));
    }
}
