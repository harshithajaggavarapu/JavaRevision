package com.interfaceExample;

public abstract class Bird implements Flyable{
    @Override
    public void fly(){
        System.out.println("I'm flying..");
    }
}
