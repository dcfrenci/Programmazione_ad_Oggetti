package org.example.array;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] v){
        Arrays.sort(v);
    }
    public static int[] bubbleSortCopy(int[] v){
        int [] ris = Arrays.copyOf(v, v.length);
        Arrays.sort(ris);
        return ris;
    }
}
