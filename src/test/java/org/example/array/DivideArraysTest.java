package org.example.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideArraysTest {

    @Test
    void divideArrays() {
        assertArrayEquals(new double[]{0.3333333333333333,0.3333333333333333,0.3333333333333333}, DivideArrays.divideArrays(new double[]{1,1,1}, new double[]{3,3,3}));
    }
}