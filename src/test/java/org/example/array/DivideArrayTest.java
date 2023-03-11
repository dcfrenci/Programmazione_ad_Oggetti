package org.example.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideArrayTest {

    @Test
    void divideArray() {
        assertArrayEquals(new double[]{0.5,0.5,0.5}, DivideArray.divideArray(new double[]{1,1,1}, 2));
        assertArrayEquals(new double[]{2,1,1}, DivideArray.divideArray(new double[]{2,1,1}, 1));
        assertArrayEquals(new double[]{1,1}, DivideArray.divideArray(new double[]{10,10}, 10));
    }
}