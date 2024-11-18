package com.abstractexample;

public class Test {
    public static void main(String[] args) {
        Circle c= new Circle(2);
        Square s = new Square(5);

        System.out.println(c.calculateArea());
        System.out.println(s.calculateArea());
    }
}
