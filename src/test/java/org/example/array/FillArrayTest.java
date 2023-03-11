package org.example.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FillArrayTest {

    @Test
    void fillArray() {
        assertArrayEquals(new double[]{0,0,0}, FillArray.fillArray(3, 0, false));
        assertArrayEquals(new double[]{1,1,1,1,1}, FillArray.fillArray(5, 1, false));
        double[] vett = FillArray.fillArray(5, 1, true);
        for (double v : vett) {
            if (v < 0.5 || v > 1.5) {
                fail();
            }
        }
    }
}