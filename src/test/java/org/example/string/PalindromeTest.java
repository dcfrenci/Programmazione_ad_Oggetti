package org.example.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void isPalindrome() {
        assertTrue(Palindrome.isPalindrome("assttssa"));
        assertFalse(Palindrome.isPalindrome("sommozzatore"));
        assertTrue(Palindrome.isPalindrome("s"));
        assertTrue(Palindrome.isPalindrome(""));
    }
}