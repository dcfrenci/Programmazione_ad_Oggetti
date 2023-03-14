package org.example.string;

public class SumDigit {
    public static int sumDigits(String string){
        int ris = 0;
        for(int i = 0; i < string.length(); i++){
            if(Character.isDigit(string.charAt(i))){
                ris += Character.digit(string.charAt(i), 10);
            }
        }
        return ris;
    }
}
