package org.example.array;

public class TenRun {
    public static int[] tenRun(int[] v){
        int[] ris = new int[v.length];
        int val = 0;
        for(int i = 0; i < v.length; i++){
            if (v[i] % 10 == 0){
                val = v[i];
                ris[i] = v[i];
            }
            else {
                if(val != 0) ris[i] = val;
                else ris[i] = v[i];
            }
        }
        return ris;
    }
}
