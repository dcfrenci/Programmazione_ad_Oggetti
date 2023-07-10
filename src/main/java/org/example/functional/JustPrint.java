package org.example.functional;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class JustPrint {
    public static <T> void justPrintList(List<T> list){
        list.forEach(elem -> System.out.println("Hello " + elem + "!"));
    }
    public static <K,V> void justPrintMap(Map<K, V> map){
        map.forEach((key, value) -> System.out.println("k:" + key + ", v:" + value));
    }
}
