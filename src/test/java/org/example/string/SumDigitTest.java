package org.example.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumDigitTest {

    @Test
    void sumDigits() {
        assertEquals(6, SumDigit.sumDigits("vivalavita3bbbbb2nn1"));
    }
}