package org.example.string;

public class RemoveFirstTwoChars {
    public static String removeFirstTwoChars(String string){
        if(string.length() <= 2) return "";
        char [] vet = string.toCharArray();
        return String.copyValueOf(vet, 2, string.length() - 2);
    }
}
