package org.example.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void bubbleSort() {
        assertArrayEquals(new int []{0,1,2,3,4,5,6,7,8,9}, BubbleSort.bubbleSortCopy(new int [] {9,8,7,6,5,4,3,2,1,0}));
    }

    @Test
    void bubbleSortCopy() {
        int [] vet = {9,8,7,6,5,4,3,2,1,0};
        assertArrayEquals(new int []{0,1,2,3,4,5,6,7,8,9}, BubbleSort.bubbleSortCopy(vet));
        assertArrayEquals(new int []{9,8,7,6,5,4,3,2,1,0}, vet);
    }
}