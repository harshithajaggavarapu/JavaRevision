package com.threads99to102.onezerotwo;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SignalThread t1= new SignalThread(TrafficSignal.RED);
        SignalThread t2= new SignalThread(TrafficSignal.GREEN);
        SignalThread t3= new SignalThread(TrafficSignal.YELLOW);
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
    }
}
