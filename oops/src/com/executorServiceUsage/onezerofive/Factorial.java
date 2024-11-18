package com.executorServiceUsage.onezerofive;

import java.util.concurrent.Callable;

public class Factorial implements Callable<Double> {

    private final int n;

    public Factorial(int x){
        n=x;
    }
    @Override
    public Double call() throws Exception {
        return fact(n);
    }

    public double fact(int i){
        if(i==1) return 1;
        return i*fact(i-1);
    }
}
