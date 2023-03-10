package org.example.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcatenateTest {

    @Test
    void concatenate() {
        assertEquals("thisisastring", Concatenate.concatenate(new String[]{"this", "is", "a", "string"}));
    }
}