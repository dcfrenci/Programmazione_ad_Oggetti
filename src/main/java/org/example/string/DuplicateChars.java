package org.example.string;

import java.util.Arrays;

public class DuplicateChars {
    public static char[] duplicateChars(String string){
        char[] vett = string.toCharArray();
        Arrays.sort(vett);
        char found = 0, value = 0;
        StringBuilder ris = new StringBuilder();
        for (char c : vett) {
            if (c == found) {
                value++;
            }
            if (value == 2 && found == c) {
                ris.append(c);
            }
            if (c != found) {
                found = c;
                value = 1;
            }
        }
        return ris.toString().toCharArray();
    }
}
