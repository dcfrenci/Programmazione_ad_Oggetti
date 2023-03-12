package org.example.string;

public class Reverse {
    public static String reverse(String string){
        return new StringBuilder(string).reverse().toString();
    }
}
