package com.executorServiceUsage.onezerothree;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutorTest {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        PrintingNumbers n = new PrintingNumbers();
        executor.submit(n);

        executor.shutdown();

    }
}
