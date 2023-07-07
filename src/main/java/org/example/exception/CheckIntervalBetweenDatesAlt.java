package org.example.exception;

import java.sql.Date;

public class CheckIntervalBetweenDatesAlt {
    public static boolean checkIntervalBetweenDatesAlt(String begin, String end) {
        try {
            return Date.valueOf(begin).toLocalDate().isBefore(Date.valueOf(end).toLocalDate());
        } catch (Exception e){
            return false;
        }
    }
}
