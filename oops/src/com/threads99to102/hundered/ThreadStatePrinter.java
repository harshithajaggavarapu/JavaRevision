package com.threads99to102.hundered;

public class ThreadStatePrinter extends Thread{

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(getState());
    }
}
