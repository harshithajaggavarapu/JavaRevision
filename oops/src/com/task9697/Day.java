package com.task9697;

public enum Day {
    MONDAY(false),TUESDAY(false),WEDNESDAY(false),THURSDAY(false),
    FRIDAY(false),SATURDAY(true),SUNDAY(true);
    private final boolean isWeekend;

    private Day(boolean we){
        this.isWeekend= we;
    }
    public boolean getWeekend(){
        return this.isWeekend;
    }
    public String getDayType(){
        return this.isWeekend?" weekend" : " weekday";
    }
}
