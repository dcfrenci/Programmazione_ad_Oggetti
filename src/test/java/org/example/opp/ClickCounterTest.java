package org.example.opp;

import org.example.opp.basic.ClickCounter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClickCounterTest {
    ClickCounter ogg = new ClickCounter();
    @Test
    void getValue() {
        assertEquals(ogg.getValue(), (new ClickCounter()).getValue());
    }
    @Test
    void click() {
        ogg.click();
        ClickCounter test = new ClickCounter();
        test.click();
        assertEquals(ogg.getValue(), test.getValue());
    }

    @Test
    void undo() {
        ogg.undo();
        assertEquals(ogg.getValue(), (new ClickCounter()).getValue());
    }

    @Test
    void reset() {
        ogg.click();
        ogg.reset();
        assertEquals(ogg.getValue(), 0);
    }
}