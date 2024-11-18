package com.threads99to102.hundredandone;

public class ThreadStartEnd extends Thread{
    private int num;

    public ThreadStartEnd(int n){
        this.num = n;
    }
    @Override
    public void run() {
        System.out.println(num+"STARTED");
    }
}
