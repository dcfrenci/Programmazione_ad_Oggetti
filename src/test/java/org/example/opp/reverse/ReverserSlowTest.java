package org.example.opp.reverse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverserSlowTest {

    @Test
    void reverse() {
        Reverser rev = new ReverserSlow();
        assertEquals(".baLeOS", rev.reverse("SOeLab."));
    }
}