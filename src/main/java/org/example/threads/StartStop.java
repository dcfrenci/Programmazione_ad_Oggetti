package org.example.threads;

import java.util.concurrent.TimeUnit;

public class StartStop extends Thread{
    public StartStop(String name){
        super(name);
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            Thread.currentThread().setName("t1");
            long startTime = System.nanoTime();
            System.out.println(Thread.currentThread().getName() + " started");
            long currentTime = 0;
            while (!Thread.interrupted()) {
                if (currentTime == 0 || (TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - startTime)) != currentTime){
                    System.out.println(Thread.currentThread().getName() + " running since " + TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - startTime) + " ms");
                    currentTime = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - startTime);
                }
            }
            System.out.println(Thread.currentThread().getName() + " terminated");
        });
        Thread t2 = new Thread(() -> {
            Thread.currentThread().setName("t2");
            long startTime = System.nanoTime();
            System.out.println(Thread.currentThread().getName() + " started");
            long currentTime = 0;
            while (!Thread.currentThread().isInterrupted()) {
                if (currentTime == 0 || (TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - startTime)) != currentTime){
                    System.out.println(Thread.currentThread().getName() + " running since " + TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - startTime) + " ms");
                    currentTime = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - startTime);
                }
            }
            System.out.println(Thread.currentThread().getName() + " terminated");
        });
        t1.start();
        t2.start();

        Thread.sleep(100L);

        t1.interrupt();
        t2.interrupt();

        t1.join();
        t2.join();
    }
}
