package org.example.generics;

import java.util.ArrayList;
import java.util.List;

public class IterableToString {
    public static <E> String iterableToString(Iterable<E> src){
        StringBuilder stringBuilder = new StringBuilder();
        for(E elem: src){
            stringBuilder.append(elem).append(", ");
        }
        return stringBuilder.toString();
    }
}
