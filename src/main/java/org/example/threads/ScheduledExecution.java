package org.example.threads;

import java.time.LocalTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecution extends Thread {
    public static void main(String[] args) throws InterruptedException {
        /*ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        int nThread = 100;
        Thread [] array = new Thread[nThread];
        for (int i = 0; i < nThread; i++){
            array[i] = new Thread(() -> {
                System.out.println(LocalTime.now() + " Hello");
            });
            sleep(1000);
            executorService.submit(array[i]);
        }*/
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.scheduleAtFixedRate(new Thread(() -> {
            System.out.println(LocalTime.now());
        }), 0, 1, TimeUnit.SECONDS);
        sleep(10 * 1000);
        executorService.shutdown();
    }
}
