package org.example.functional;

import java.util.List;
import java.util.stream.Collectors;

public class SquareFive {
    public static long squareFive(List<Integer> nums){
        return nums.stream().map(elem -> (elem *= elem) + 10).filter(elem -> elem % 10 != 5).toList().size();
    }
}
