package org.example.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountYZTest {

    @Test
    void countYZ() {
        assertEquals(2, CountYZ.countYZ("fez day"));
        assertEquals(2, CountYZ.countYZ("day fez"));
        assertEquals(2, CountYZ.countYZ("day feeezzzzzyyyy"));
    }
}