package org.example.string;

public class GoodAroundTheBeginning {
    public static boolean goodAroundTheBeginning(String string){
        /*String verify = string.stripLeading();
        return verify.startsWith("good");*/
        return string.startsWith("good") || string.startsWith("good", 1);
    }
}
