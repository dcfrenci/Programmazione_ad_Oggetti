package org.example.threads;

import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerUnsafe extends Thread {
    public static void main(String[] args) throws InterruptedException {
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        Thread producer = new Thread(() -> {
            while (!interrupted()){
                queue.add(1);
            }
        });
        Thread consumer = new Thread(() -> {
            long counter = 0;
            while (!interrupted()){
                if (queue.poll() != null) counter++;
            }
            System.out.println("Total number of consumed elements: " + counter);
        });
        producer.start();
        consumer.start();
        sleep(100);
        producer.interrupt();
        consumer.interrupt();
        producer.join();
        consumer.join();
    }
}
