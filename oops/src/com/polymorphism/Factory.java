package com.polymorphism;


public class Factory{
    public Shape checker(String x){
        return switch (x) {
            case "Circle" -> new Circle();
            case "Triangle" -> new Triangle();
            default -> new Square();
        };
    }
}