package org.example.functional;

import java.util.List;
import java.util.stream.Collectors;

public class NoYYZ {
    public static List<String> noYYZ(List<String> strings){
        return strings.stream().map(elem -> elem + "y").filter(elem -> !elem.contains("yy")).peek(elem -> {if (elem.startsWith("z")) System.out.println(elem);}).collect(Collectors.toList());
    }
}
