package com.enumsExample;

public enum TrafficLight {
    RED("stop"),YELLOW("careful"),GREEN("Go");
    private final String action;

    private TrafficLight(String action) {
        this.action = action;
    }
    public String getAction(){
        return this.action;
    }

}
