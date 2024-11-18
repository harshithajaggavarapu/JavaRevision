package com.functionalProgramming.onetwelve;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        System.out.println(check(""));
    }
    public static Optional<String> check(String s){
        if(s==null || s.isEmpty()){
            return Optional.empty();
        }
        return Optional.of(s.toUpperCase());
    }
}
