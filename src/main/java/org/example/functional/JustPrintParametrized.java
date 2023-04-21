package org.example.functional;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class JustPrintParametrized {
    public static <E> void justPrintList(List<E> list, Consumer<E> consumer){
        list.forEach(consumer);
    }
    public static <K, V> void justPrintMap(Map<K, V> map, BiConsumer<K, V> consumer){
        map.forEach(consumer);
    }
}
