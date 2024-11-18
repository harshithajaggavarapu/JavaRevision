package com.functionalProgramming.onezeroseven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hi","hello","namaste","good morning");
//        list.forEach(System.out::println);
        list.stream().forEach(l-> System.out.println(l));
    }
}
