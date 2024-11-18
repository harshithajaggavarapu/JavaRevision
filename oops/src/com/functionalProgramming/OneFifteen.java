package com.functionalProgramming;

import java.util.List;

public class OneFifteen {
    public static void main(String[] args) {
        List<String> l = List.of("1","2","3","4","6");
        l.stream().map(Integer::parseInt)
                .map(n->Math.pow(n,2)).reduce(Double::sum)
                .ifPresent(System.out::println);
    }
}
