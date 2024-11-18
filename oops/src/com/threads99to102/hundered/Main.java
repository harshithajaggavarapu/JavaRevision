package com.threads99to102.hundered;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadStatePrinter t1= new ThreadStatePrinter();
        System.out.println(t1.getState());
        t1.start();
        t1.join();
        System.out.println(t1.getState());

    }
}
