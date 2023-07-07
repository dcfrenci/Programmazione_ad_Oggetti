package org.example.exception;

import java.sql.Date;
import java.text.ParseException;
import java.time.LocalDate;

public class CheckIntervalBetweenDates {
    public static boolean checkIntervalBetweenDates(String begin, String end) throws ParseException {
        LocalDate dateBegin = LocalDate.parse(begin);
        LocalDate dateEnd = LocalDate.parse(end);
        return dateBegin.isBefore(dateEnd);
    }
}
