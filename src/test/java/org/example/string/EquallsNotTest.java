package org.example.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EquallsNotTest {

    @Test
    void equalIsNot() {
        assertTrue(EquallsNot.equalIsNot("This is not"));
        assertTrue(EquallsNot.equalIsNot("noisissioisihifoas"));
        assertFalse(EquallsNot.equalIsNot("This is notnot"));
    }
}