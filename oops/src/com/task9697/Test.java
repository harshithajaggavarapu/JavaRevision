package com.task9697;

public class Test {
    public static void main(String[] args) {
        for( Day day : Day.values()){
            System.out.println(day);
        }

        System.out.println("Type of days");
        for(Day d : Day.values()){
            System.out.println(d+" is "+ d.getDayType());
        }
    }
}
