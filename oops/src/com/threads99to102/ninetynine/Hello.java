package com.threads99to102.ninetynine;

public class Hello{
    public static void main(String[] args) throws InterruptedException {
        Print p1= new Print("first");
        Print p2 = new Print("second");
        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        t1.start();
        t1.join();
        t2.start();

    }
}
