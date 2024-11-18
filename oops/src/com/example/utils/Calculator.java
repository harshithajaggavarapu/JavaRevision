package com.example.utils;

import com.example.geometry.Circle;
import com.example.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(1,2);

        double areaOfC = Math.PI * Math.pow(c.getRadius(),2);
        double areaOfR = r.getBreadth()*r.getLength();
        System.out.println("area of circle: "+ areaOfC);
        System.out.println("area of rectangle: "+ areaOfR);
    }

}
