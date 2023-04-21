package org.example.functional;

import java.util.List;
import java.util.stream.Collectors;

public class NoTeen {
    public static List<Integer> noTeen(List<Integer> nums){
        return nums.stream().filter(elem -> elem < 13 || elem > 19).collect(Collectors.toList());
    }
}
