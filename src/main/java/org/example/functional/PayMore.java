package org.example.functional;

import java.util.Map;

public class PayMore {
    public static void payMore(Map<String, Double> fees, String numberFamily, double costDelta){
        //fees.replaceAll((key, value) -> {if (key.startsWith(numberFamily)) return value + costDelta; return value;});
        fees.replaceAll((key, value) -> key.startsWith(numberFamily) ? value + costDelta : value);
    }
}
