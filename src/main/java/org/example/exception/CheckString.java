package org.example.exception;

import java.text.ParseException;

public class CheckString {
    public static void checkString(String s) throws ParseException {
        int pos = 0;
        if (s.length() % 2 != 0) throw new ParseException(s, 0);
        for (char c: s.toCharArray()){
            if (pos % 2 == 0){
                if (!Character.isAlphabetic(c)) throw new ParseException(s, pos);
            } else {
                if (!Character.isDigit(c)) throw new ParseException(s, pos);
            }
            pos++;
        }
    }
}
