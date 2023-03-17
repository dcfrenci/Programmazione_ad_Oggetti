package org.example.opp.reverse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverserFastTest {

    @Test
    void reverse() {
        Reverser rev = new ReverserFast();
        assertEquals(".baLeOS", rev.reverse("SOeLab."));
    }
}