package org.example.threads;

import java.util.PriorityQueue;
import java.util.Queue;

public class ProducerConsumerSafe extends Thread {
    public static void main(String[] args) throws InterruptedException {
        Queue<Integer> queue = new PriorityQueue<>();
        ProducerConsumerSafe producerConsumerSafe = new ProducerConsumerSafe();
        Thread producer = new Thread(() -> {
            while(!interrupted()) {
                synchronized (queue) {
                    queue.add(1);
                }
            }
        });
        Thread consumer = new Thread(() -> {
            long counter = 0;
            while (!interrupted()){
                synchronized (queue) {
                    if (queue.poll() != null) counter++;
                }
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
