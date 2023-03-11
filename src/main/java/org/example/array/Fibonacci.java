package org.example.array;

public class Fibonacci {
    public static long fibonacciNumber(long val){
        if(val <= 0) return 0;
        if(val == 1) return 1;
        else return fibonacciNumber(val - 1) + fibonacciNumber(val - 2);
    }
    public static long[] fibonacci(int n){
        long[] sequence = new long[n];
        for(int i = 0; i < n; i++){
            sequence[i] = fibonacciNumber((long)i);
        }
        return sequence;
    }
}
