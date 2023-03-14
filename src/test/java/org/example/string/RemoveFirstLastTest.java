package org.example.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveFirstLastTest {

    @Test
    void removeFirstLast() {
        assertEquals("google", RemoveFirstLast.removeFirstLast("google"));
        assertEquals("oogl", RemoveFirstLast.removeFirstLast("eoogle"));
        assertEquals("", RemoveFirstLast.removeFirstLast("FF"));
        assertEquals("F", RemoveFirstLast.removeFirstLast("F"));
    }
}