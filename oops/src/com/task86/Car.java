package com.task86;

public class Car extends Vehicle{
    @Override
    public void service(){
        super.service();
        System.out.println("Car is in service");
    }
}
