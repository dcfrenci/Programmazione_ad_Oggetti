package org.example.array;

public class Splitter {
    public static int[] splitter(int input){
        String stringa = Integer.toString(input);
        int [] ris = new int[stringa.length()];
        for(int i = 0; i < ris.length; i++){
            ris[i] = stringa.charAt(i) - 48;
        }
        stringa = null;
        return ris;
    }
}
