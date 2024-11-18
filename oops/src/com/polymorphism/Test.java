package com.polymorphism;

public class Test {
    public static void main(String[] args) {
        Factory f = new Factory();
        Shape s = f.checker("Circle");
        System.out.println(s.draw());
    }
}
