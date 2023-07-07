package org.example.functional;

import java.util.HashSet;
import java.util.List;

public class AllPalindrome {
    public static boolean allPalindrome(List<String> strings){
        return new HashSet<>(strings).containsAll(strings.stream().map(str -> new StringBuilder(str).reverse().toString()).toList());
    }
}
