package com.threads99to102.hundredandone;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadStartEnd t1 = new ThreadStartEnd(1);
        ThreadStartEnd t2= new ThreadStartEnd(2);
        ThreadStartEnd t3= new ThreadStartEnd(3);

        t1.start();
        t1.join();
        System.out.println("T1 is finished");
        t2.start();
        t2.join();
        System.out.println("T2 is finished");
        t3.start();
        t3.join();
        System.out.println("T3 is finished");
    }
}
