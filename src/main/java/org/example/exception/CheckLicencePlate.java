package org.example.exception;

public class CheckLicencePlate {
    public static void checkLicencePlate(String licence) {
        if (licence.length() != "LLDDDLL".length()) throw new IllegalArgumentException();
        String string = licence.substring(0, 2) + licence.substring(5);
        for (char c: string.toCharArray()) {
            if (Character.isDigit(c)) throw  new IllegalArgumentException();
        }
        for (char c: licence.substring(2, 5).toCharArray()) {
            if (Character.isAlphabetic(c)) throw new IllegalArgumentException();
        }
    }
}
