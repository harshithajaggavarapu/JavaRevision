package com.threads99to102.onezerotwo;

public enum TrafficSignal {
    RED(3000),GREEN(5000),YELLOW(1000);

    private final int onTime;
    TrafficSignal(int onTime){
        this.onTime = onTime;
    }

    public int getOnTime() {
        return onTime;
    }
}
