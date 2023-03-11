package org.example.array;

public class IsEverywhere {
    public static boolean isEverywhere(int[] v, int value){
        if(v.length % 2 != 0) return false;
        for(int i = 0; i < v.length; i += 2){
            if(v[i] != value && v[i + 1] != value){
                return false;
            }
        }
        return true;
    }
}
