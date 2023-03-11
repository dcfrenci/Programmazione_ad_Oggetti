package org.example.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void fibonacciNumber() {
        assertEquals(0, Fibonacci.fibonacciNumber(0));
        assertEquals(1, Fibonacci.fibonacciNumber(1));
        assertEquals(34, Fibonacci.fibonacciNumber(9));
    }

    @Test
    void fibonacci() {
        assertArrayEquals(new long[]{0}, Fibonacci.fibonacci(1));
        assertArrayEquals(new long[]{0,1}, Fibonacci.fibonacci(2));
        assertArrayEquals(new long[]{0,1,1,2,3}, Fibonacci.fibonacci(5));
    }
}