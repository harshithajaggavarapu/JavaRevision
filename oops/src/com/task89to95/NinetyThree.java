package com.task89to95;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class NinetyThree {
    public static void reverse(List<Integer> l){
        for(int i=0;i<l.size()/2;i++){
            NinetyTwo.swapInList(l,i,l.size()-i-1);
        }
    }

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(Arrays.asList(1,2,3,4));
        System.out.println(l);
        reverse(l);
        System.out.println(l);
    }
}
