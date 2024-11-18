package com.task89to95;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ninety {
    public static void main(String[] args) {
        List<String> s = new ArrayList<>(Arrays.asList("hi","hello","wow"));
        System.out.println(s);
        sort(s);
        System.out.println(s);

    }
    public static void sort(List<String> x){
        Collections.sort(x);
        Collections.reverse(x);
    }
}
