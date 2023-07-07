package org.example.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.random.RandomGenerator;

public class ThreadPool extends Thread {
    public ThreadPool(String name) {
        super(name);
    }

    @Override
    public void run() {
        long startTime = System.nanoTime();
        System.out.println("START thread = " + Thread.currentThread().getName() + " task = " + getName().substring(getName().length() - 1));
        RandomGenerator rand = RandomGenerator.getDefault();
        int random = rand.nextInt(0, 1000);
        try {
            Thread.sleep(random);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("END thread = " + Thread.currentThread().getName() + " task = " + getName().substring(getName().length() - 1) + " t = " + TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - startTime));
    }

    public static void main(String[] args) throws InterruptedException {
        ArrayList<ThreadPool> arrayList = new ArrayList<>(List.of(new ThreadPool("t1"), new ThreadPool("t2"), new ThreadPool("t3"), new ThreadPool("t4")));
        for (ThreadPool elem: arrayList){
            elem.start();
        }
        for (ThreadPool elem: arrayList){
            elem.join();
        }
    }
}
