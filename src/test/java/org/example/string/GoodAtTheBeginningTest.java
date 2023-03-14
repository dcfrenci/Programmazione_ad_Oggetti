package org.example.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoodAtTheBeginningTest {

    @Test
    void goodAtTheBeginning() {
        assertTrue(GoodAtTheBeginning.goodAtTheBeginning("good false"));
        assertTrue(GoodAtTheBeginning.goodAtTheBeginning("good"));
        assertFalse(GoodAtTheBeginning.goodAtTheBeginning("goo"));
        assertFalse(GoodAtTheBeginning.goodAtTheBeginning(" good"));
    }
}