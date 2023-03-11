package org.example.array;

import java.util.Arrays;

public class DeepCopy {
    public static int[][] deepCopy(int[][] original){
        int[][] copy = new int[original.length][];
        for(int i = 0; i < copy.length; i++){
            copy[i] = Arrays.copyOf(original[i], original[i].length);
        }
        return copy;
    }
}
