package com.abstractexample;

public class Circle extends Shape {
    private final double radius;

    public Circle(double r){
        this.radius = r;
    }
    @Override
    public double calculateArea(){
        return Math.PI*Math.pow(this.radius,2);
    }
}
