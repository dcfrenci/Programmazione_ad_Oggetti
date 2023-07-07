package org.example.exception;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

import static org.junit.jupiter.api.Assertions.*;

class CheckIntervalBetweenDatesAltTest {

    @Test
    void checkIntervalBetweenDatesAlt() {
        assertTrue(CheckIntervalBetweenDatesAlt.checkIntervalBetweenDatesAlt("2022-12-15", "2022-12-17"));
        assertFalse(CheckIntervalBetweenDatesAlt.checkIntervalBetweenDatesAlt("2022-12-15", "2021-12-15"));
        assertFalse(CheckIntervalBetweenDatesAlt.checkIntervalBetweenDatesAlt("15/12/2022", "17/12/1922"));
    }
}