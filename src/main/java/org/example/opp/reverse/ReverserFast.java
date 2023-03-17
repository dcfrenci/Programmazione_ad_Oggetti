package org.example.opp.reverse;

public class ReverserFast implements Reverser{
    @Override
    public String reverse(String string) {
        return new StringBuilder(string).reverse().toString();
    }
}
