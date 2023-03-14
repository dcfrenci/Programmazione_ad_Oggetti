package org.example.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveFirstTwoCharsTest {

    @Test
    void removeFirstTwoChars() {
        assertEquals("stringa", RemoveFirstTwoChars.removeFirstTwoChars("12stringa"));
    }
}