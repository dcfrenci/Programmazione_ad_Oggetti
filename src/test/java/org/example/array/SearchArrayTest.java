package org.example.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchArrayTest {

    @Test
    void containsBruteForce() {
        assertTrue(SearchArray.containsBruteForce(new String[]{"car", "boat", "bike", "plane"}, "bike"));
        assertFalse(SearchArray.containsBruteForce(new String[]{"car", "boat", "bike", "plane"}, "helicopter"));
    }

    @Test
    void containsBinary() {
        assertTrue(SearchArray.containsBruteForce(new String[]{"car", "boat", "bike", "plane"}, "bike"));
        assertFalse(SearchArray.containsBruteForce(new String[]{"car", "boat", "bike", "plane"}, "helicopter"));
    }
}