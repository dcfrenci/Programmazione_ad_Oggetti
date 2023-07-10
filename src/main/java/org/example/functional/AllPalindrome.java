package org.example.functional;

import java.util.List;
import java.util.stream.IntStream;

public class AllPalindrome {
    public static boolean allPalindrome(List<String> strings){
        return strings.stream().allMatch(string -> IntStream.range(0, string.length()).noneMatch(i -> string.charAt(i) != string.charAt(string.length() - 1 - i)));
    }
}
