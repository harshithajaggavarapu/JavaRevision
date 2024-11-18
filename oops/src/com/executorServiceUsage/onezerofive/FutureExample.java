package com.executorServiceUsage.onezerofive;

import java.util.concurrent.*;

public class FutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Factorial f1 = new Factorial(3);
        Factorial f2 = new Factorial(5);
        Factorial f3 = new Factorial(6);
        Factorial f4 = new Factorial(7);
        Factorial f5 = new Factorial(10);

        Future<Double> val1 = executor.submit(f1);
        Future<Double> val2 = executor.submit(f2);
        Future<Double> val3 = executor.submit(f3);
        Future<Double> val4 = executor.submit(f4);
        Future<Double> val5 = executor.submit(f5);

        System.out.println("Factorial of 3: "+ val1.get());
        System.out.println("Factorial of 5: "+ val2.get());
        System.out.println("Factorial of 6: "+ val3.get());
        System.out.println("Factorial of 7: "+ val4.get());
        System.out.println("Factorial of 10: "+ val5.get());

        executor.shutdown();

        if(executor.awaitTermination(5, TimeUnit.SECONDS)){
            executor.shutdownNow();
        }

    }
}
