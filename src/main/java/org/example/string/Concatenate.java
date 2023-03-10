package org.example.string;

public class Concatenate {
    public static String concatenate(String[] strings){
        StringBuilder ris = new StringBuilder();
        for (String string : strings) {
            ris.append(string);
        }
        return ris.toString();
    }
}
