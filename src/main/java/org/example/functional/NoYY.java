package org.example.functional;

import java.util.List;
import java.util.stream.Collectors;

public class NoYY {
    public static List<String> noYY(List<String> strings){
        return strings.stream().map(elem -> elem + "y").filter(elem -> !elem.contains("yy")).collect(Collectors.toList());
    }
}
