package org.example.string;

import java.util.Scanner;

public class EquallsNot {
    public static boolean equalIsNot(String string){
        Scanner scan = new Scanner(string);
        int is = 0, not = 0;
        while (scan.hasNext()){
            String str = scan.next();
            if(str.equals("is")) is++;
            if(str.equals("not")) not++;
        }
        return is == not;
    }
}
