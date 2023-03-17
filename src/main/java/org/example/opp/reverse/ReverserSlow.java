package org.example.opp.reverse;

import org.example.string.Reverse;

public class ReverserSlow implements Reverser{
    @Override
    public String reverse(String string) {
        char [] str = string.toCharArray();
        for(int i = 0; i < str.length / 2; i++){
            char temp = str[i];
            str[i] = str[str.length - i - 1];
            str[str.length - i - 1] = temp;
        }
        return String.valueOf(str);
    }
}
