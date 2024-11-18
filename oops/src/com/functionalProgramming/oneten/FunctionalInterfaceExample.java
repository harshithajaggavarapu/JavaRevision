package com.functionalProgramming.oneten;

public class FunctionalInterfaceExample{
    public static void main(String[] args) {
        Checker c = n->{
            if(n%2==0) return true;
            return false;
        };

        System.out.println(c.isChecked(3));
    }
}
