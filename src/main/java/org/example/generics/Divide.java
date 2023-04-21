package org.example.generics;

public class Divide {
    public static <T extends Number> double divide(T a, T b){
        return a.floatValue() / b.floatValue();
    }
}
