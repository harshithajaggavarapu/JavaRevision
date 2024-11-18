package com.functionalProgramming.onezeroeight;

import java.util.List;

public class StreamExample2 {
    public static void main(String[] args) {
        List<String> list = List.of("harshitha reddy","jaggavarapu","good things","happiness","hi");

       String ans= list.stream().filter(l->l.length()>=10).reduce("",(a,b)->a+" "+b);
        System.out.println(ans);
    }
}
