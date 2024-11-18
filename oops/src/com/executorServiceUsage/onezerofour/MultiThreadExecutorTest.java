package com.executorServiceUsage.onezerofour;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MultiThreadExecutorTest {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        PrintAndSleep p= new PrintAndSleep();
        executor.submit(p);
        executor.submit(p);
        executor.submit(p);
        executor.submit(p);
        executor.submit(p);
        executor.submit(p);
        executor.submit(p);

        executor.shutdown();
        if(!executor.awaitTermination(2, TimeUnit.SECONDS)){
            System.out.println("force shutdown");
            executor.shutdownNow();
        }
    }
}
