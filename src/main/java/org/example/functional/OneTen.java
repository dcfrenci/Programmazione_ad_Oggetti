package org.example.functional;

import java.util.List;
import java.util.stream.Collectors;

public class OneTen {
    public static List<Integer> oneTen(List<Integer> nums){
        return nums.stream().map(elem -> (elem + 1) * 10).collect(Collectors.toList());
    }
}
