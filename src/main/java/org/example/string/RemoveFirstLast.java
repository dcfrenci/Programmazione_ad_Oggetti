package org.example.string;

public class RemoveFirstLast {
    public static String removeFirstLast(String string){
        if(string.length() < 2) return string;
        if(string.charAt(0) == string.charAt((string.length()) - 1)){
            //return string.substring(0, string.length() - 1);
            //return "aenema".substring(0, "aenema".length() - 1);
            return string.substring(1, string.length() - 1);
        }
        return string;
    }
}
