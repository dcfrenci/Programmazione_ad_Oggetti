package org.example.generics;

import java.util.Collections;
import java.util.List;

public class Reverse {
    public static <T> void reverse(List<T> list){
        Collections.reverse(list);
    }
}
