package org.example.threads;

import java.sql.Array;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.random.RandomGenerator;

public class ThreadPoolExecutor extends Thread{
    /*public ThreadPoolExecutor(String name) {
        super(name);
    }*/

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        int nThread = 8;
        RandomGenerator randomGenerator = RandomGenerator.getDefault();
        Thread[] array = new Thread[nThread];
        for (int task = 0; task < nThread; task++){
            int taskNumber = task;
            array[task] = new Thread(() -> {
                long startTime = System.nanoTime();
                System.out.println("START thread=" + Thread.currentThread().getName() + " task=" + taskNumber);
                try {
                    sleep(randomGenerator.nextInt(0, 1000));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("STOP thread=" + Thread.currentThread().getName() + " task=" + taskNumber + " t=" + TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - startTime));
            });
            executorService.submit(array[task]);
        }
        executorService.shutdown();
    }
}
