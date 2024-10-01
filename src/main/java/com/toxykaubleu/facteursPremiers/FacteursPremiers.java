package com.toxykaubleu.facteursPremiers;

import java.util.*;

public class FacteursPremiers {
    public static List<Integer> generate(Integer n) {
        List<Integer> result = new ArrayList<Integer>();
        int i = 2;
        while (i <= n) {
            if (n % i == 0) {
                result.add(i);
                n = n / i;
            } else {
                i++;
            }
        }
        return result;
    }
}
