package org.example.array;

public class CanBalance {
    public static boolean canBalance(int[] v){
        int firstHalf = 0;
        for(int i = 0; i <= v.length / 2; i++){
            if(v.length % 2 == 0 && i == v.length / 2) break;
            firstHalf += v[i];
        }
        int secondHalf = 0;
        for(int i = v.length / 2; i < v.length; i++){
            secondHalf += v[i];
        }
        if(v.length % 2 != 0) secondHalf -= v[v.length / 2];
        return firstHalf == secondHalf;
    }
}
