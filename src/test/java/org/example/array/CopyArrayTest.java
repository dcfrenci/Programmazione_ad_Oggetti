package org.example.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CopyArrayTest {

    @Test
    void copyArray() {
        assertArrayEquals(new double[]{1,2,3}, CopyArray.copyArray(new double[]{1,2,3}));
        assertArrayEquals(new double[]{1,2,3,4,5,6,7,8,9}, CopyArray.copyArray(new double[]{1,2,3,4,5,6,7,8,9}));
    }
}