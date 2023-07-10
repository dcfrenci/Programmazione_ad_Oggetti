package org.example.functional;

import java.util.List;
import java.util.stream.Collectors;

public class TwoTwo {
    public static List<Integer> twoTwo(List<Integer> nums){
        return  nums.stream().map(elem -> elem * 2).filter(elem -> !elem.toString().endsWith("2")).collect(Collectors.toList());
    }
}
