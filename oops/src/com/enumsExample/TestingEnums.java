package com.enumsExample;

public class TestingEnums {
    public static void main(String[] args) {
        TrafficLight color = TrafficLight.GREEN;
        TrafficLight value = TrafficLight.valueOf("GREEN");
        System.out.println(value);
    }
}
