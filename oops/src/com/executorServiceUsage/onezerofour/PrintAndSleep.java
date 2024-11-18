package com.executorServiceUsage.onezerofour;

public class PrintAndSleep implements Runnable{

    @Override
    public void run() {
        System.out.println("current thread name: "+ Thread.currentThread().getName());
        int x = (int)(Math.random()*5+1);
        try {
            Thread.sleep(x* 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
