package org.example.exception;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FilterListsTest {

    @Test
    void filterLists() {
        List<List<String>> src = new ArrayList<>(List.of(List.of("a3b3h4z1r4", "a0b3h4z1r0", "a0b3h4z1r4"), List.of("a3b3h4z1r4", "rrrrrrrrrr", "a0b3h4z1r4"), List.of("a3b3h4z1r4", "a0b3h4z1r0", "0000000000"), List.of("a3b3h4z1r4", "a0b3h4z1r0", "a0b3h4z1r4")));
        assertEquals(List.of(List.of("a3b3h4z1r4", "a0b3h4z1r0", "a0b3h4z1r4"), List.of("a3b3h4z1r4", "a0b3h4z1r0",
                "a0b3h4z1r4")), FilterLists.filterLists(src));
    }
}