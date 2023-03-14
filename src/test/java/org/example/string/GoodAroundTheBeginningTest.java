package org.example.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoodAroundTheBeginningTest {

    @Test
    void goodAroundTheBeginning() {
        assertTrue(GoodAtTheBeginning.goodAtTheBeginning("good false"));
        assertTrue(GoodAtTheBeginning.goodAtTheBeginning("good"));
        assertFalse(GoodAtTheBeginning.goodAtTheBeginning("goo"));
        assertTrue(GoodAtTheBeginning.goodAtTheBeginning(" good"));
    }
}