package org.example.string;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class CountYZ {
    public static int countYZ(String string){
        Scanner scan = new Scanner(string);
        int ris = 0;
        while(scan.hasNext()){
            String str = scan.next();
            if(str.endsWith("y") || str.endsWith("Y") || str.endsWith("z") || str.endsWith("Z")) ris++;
        }
        return ris;
    }
}
