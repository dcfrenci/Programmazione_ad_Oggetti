package org.example.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {

    @Test
    void reverse() {
        assertEquals("tset gnirtS", Reverse.reverse("String test"));
        assertEquals("eoD nhoJ", Reverse.reverse("John Doe"));
        assertEquals("!dlroW olleH", Reverse.reverse("Hello World!"));
    }
}