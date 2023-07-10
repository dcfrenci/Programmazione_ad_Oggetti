package org.example.functional;

import java.util.List;

public class SquareFive {
    public static long squareFive(List<Integer> nums){
        return nums.stream().map(elem -> elem * elem + 10).filter(elem -> elem % 10 != 5).count();
    }
}
