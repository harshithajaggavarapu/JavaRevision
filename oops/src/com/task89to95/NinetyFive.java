package com.task89to95;

import java.util.HashSet;
import java.util.Set;

public class NinetyFive {
    public static int charsCount(String s){
        Set<Character> se = new HashSet<>();
        for(int i=0;i<s.length();i++){
            se.add(s.charAt(i));
        }
        return se.size();
    }

    public static void main(String[] args) {
        String s = "harshitha";
        System.out.println(charsCount(s));
    }
}
