package org.example.opp.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterTest {
    Letter envelope = new Letter("Fransceso", "Lorenzo");
    @Test
    void addLine() {
        envelope.addLine("Stringa");
    }

    @Test
    void toText() {
        envelope.addLine("Stringa");
        String str = """
                Dear Lorenzo

                Stringa

                Sincerely,

                Fransceso""";
        assertEquals(str, envelope.toText());
    }
}