package com.task85;

public class Test {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.sum(1,2));
        System.out.println(c.sum(1.2,5.3));
        System.out.println(c.sum(1,2,3));
    }
}
