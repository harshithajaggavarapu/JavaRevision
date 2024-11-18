package com.functionalProgramming.onethirteen;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DistinctStreamExample {
    public static void main(String[] args) {
        List<Integer> l = List.of(1,2,3,4,5,1,24,4,5);
        List<Integer> x= l.stream().distinct().toList();
        System.out.println(x);
    }
}
