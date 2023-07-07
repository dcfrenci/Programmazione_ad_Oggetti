package org.example.exception;

import java.util.ArrayList;
import java.util.List;

public class FilterLists {
    public static List<String> filterItems(List<String> strings){
        List<String> stringList = new ArrayList<>();
        for (String s: strings){
            int pos = 0;
            if (s.length() % 2 != 0) continue;
            boolean add = true;
            for (char c: s.toCharArray()){
                if (pos % 2 == 0){
                    if (!Character.isAlphabetic(c)) add = false;
                } else {
                    if (!Character.isDigit(c)) add = false;
                }
                pos++;
            }
            if (add) stringList.add(s);
        }
        return stringList;
    }
    public static List<List<String>> filterLists(List<List<String>> lists) {
        List<List<String>> superStringList = new ArrayList<>();
        for (List<String> stringList: lists){
            if (filterItems(stringList).size() == stringList.size()) superStringList.add(stringList);
        }
        return superStringList;
    }
}
