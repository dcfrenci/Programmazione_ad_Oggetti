package org.example.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SplitterTest {

    @Test
    void splitter() {
        int num = 123;
        assertArrayEquals(new int[]{1,2,3}, Splitter.splitter(num));
        num = 321;
        assertArrayEquals(new int[]{3,2,1}, Splitter.splitter(num));
    }
}