package com.threads99to102.ninetynine;

public class Print extends Thread {
    private String threadname;

    public Print(String name){
        this.threadname = name;
    }

    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Hello from Thread "+ threadname);
        }
    }
    public String getThreadname(){
        return this.threadname;
    }
}
