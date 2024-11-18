package com.task89to95;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NinetyOne {
    public static int count(List<Integer> x, int n){
        return Collections.frequency(x,n);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,1,3,1);
        System.out.println(count(list,1));
    }
}
