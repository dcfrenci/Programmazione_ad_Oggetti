package org.example.functional;

import java.util.List;
import java.util.Map;

public class JustPrint {
    public static <E> void justPrintList(List<E> list){
        list.forEach(s -> System.out.println("Hello " + s));
    }
    public static <K, V> void justPrintMap(Map<K, V> map){
        map.forEach((k, v) -> System.out.println("k: " + k + ", " + "v: " + v));
    }
}
