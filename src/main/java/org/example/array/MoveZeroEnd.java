package org.example.array;

public class MoveZeroEnd {
    public static int[] moveZerosEnd(int[] v){
        int [] ris = new int[v.length];
        int pos = 0;
        for(int i: v){
            if(i != 0){
                ris[pos] = i;
                pos++;
            }
        }
        return ris;
    }
}
