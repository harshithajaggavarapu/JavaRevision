package com.threads99to102.onezerotwo;

public class SignalThread extends Thread{
    private final TrafficSignal s;
    public SignalThread(TrafficSignal x){
        s= x;
    }
    @Override
    public void run() {
        System.out.println("started: "+ s);
        try {
            sleep(s.getOnTime());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("ended: "+ s);
    }

}
