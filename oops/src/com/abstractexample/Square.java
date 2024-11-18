package com.abstractexample;

public class Square extends Shape {
    private final double side;

    public Square(double side){
        this.side = side;
    }
    @Override
    public double calculateArea(){
        return side*side;
    }
}
