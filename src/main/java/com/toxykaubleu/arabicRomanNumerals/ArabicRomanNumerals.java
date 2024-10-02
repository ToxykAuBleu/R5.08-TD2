package com.toxykaubleu.arabicRomanNumerals;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UnknownFormatConversionException;
import java.util.stream.Stream;

public class ArabicRomanNumerals {
    private static HashMap<Integer, String> mapped = generateMap();

    private static HashMap<Integer, String> generateMap() {
        HashMap<Integer, String> result = new LinkedHashMap<>();
        result.put(1000, "M");
        result.put(500, "D");
        result.put(100, "C");
        result.put(90, "XC");
        result.put(50, "L");
        result.put(40, "XL");
        result.put(10, "X");
        result.put(9, "IX");
        result.put(5, "V");
        result.put(4, "IV");
        result.put(1, "I");
        return result;
    }
    public static String convert(Integer n) {
        String result = "";
        for (Map.Entry<Integer, String> entry : mapped.entrySet()) {
            Integer key = entry.getKey();
            String val = entry.getValue();
            while (n >= key) {
                result += val;
                n -= key;
            }
        }

        return result;
    }
}
