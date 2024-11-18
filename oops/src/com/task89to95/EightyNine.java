package com.task89to95;

public class EightyNine {
    public static String concateString(String ...s){
        StringBuilder ans= new StringBuilder();
        for(String x: s){
            ans.append(x);
            ans.append(" ");
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        System.out.println(concateString("hi","harshitha"));
    }
}
