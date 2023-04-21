package org.example.generics;

public class CountOccurences {
    public static <T> int countOccurrences(T[] src, T item){
        int counter = 0;
        if (item == null) {
            for (T listItem : src)
                if (listItem == null)
                    counter++;
        } else {
            for (T listItem : src)
                if (item.equals(listItem))
                    counter++;
        }
        return counter;
    }
}
