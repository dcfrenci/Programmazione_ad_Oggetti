package org.example.string;

public class Palindrome {
    public static boolean isPalindrome(String string){
        return string.compareTo(new StringBuilder(string).reverse().toString()) == 0;
    }
}
