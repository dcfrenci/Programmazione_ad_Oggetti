package org.example.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ParallelPrimes extends Thread {
    static class PrimeEngine implements Callable<List<Integer>> {
        int start;
        int end;

        public PrimeEngine(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }

        public List<Integer> call() {
            List<Integer> result = new ArrayList<>();
            for (int i = start; i < end; i++) {
                if (isPrime(i)) {
                    result.add(i);
                }
            }
            return result;
        }
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        ArrayList<PrimeEngine> arrayList = new ArrayList<>();
        arrayList.add(new PrimeEngine(0, 1000));
        arrayList.add(new PrimeEngine(1000, 2000));
        List<Future<List<Integer>>> results =  executorService.invokeAll(arrayList);
        for (Future<List<Integer>> result: results){
            if (result.isDone()) System.out.println("List found: " + result.get());
        }
        executorService.shutdown();
    }
}
