package com.executorServiceUsage.onezerothree;

public class PrintingNumbers implements Runnable{

    @Override
    public void run() {
        System.out.println("printing for: "+ Thread.currentThread().getName());
        for(int i=1;i<=10;i++){
            System.out.printf(i+" ");
        }
    }
}
