package com.task89to95;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NinetyTwo {
    public static void swapInList(List<Integer> s, int e1, int e2){
//        int i1 = s.indexOf(e1);
//        int i2 = s.indexOf(e2);
        int i1 = s.get(e1);
        int i2 = s.get(e2);
            s.set(e1, i2);
            s.set(e2, i1);

    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        System.out.println(list);
        swapInList(list,1,4);
        System.out.println(list);
    }
}
