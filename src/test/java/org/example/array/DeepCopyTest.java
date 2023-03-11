package org.example.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeepCopyTest {

    @Test
    void deepCopy() {
        int[][] vet = {{1,2,3}, {3,2,1}};
        int[][] copy = DeepCopy.deepCopy(vet);
        assertArrayEquals(vet, copy);
    }
}