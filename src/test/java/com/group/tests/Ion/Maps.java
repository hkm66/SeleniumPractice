package com.group.tests.Ion;

import java.util.LinkedHashMap;
import java.util.Map;

public class Maps {
    public static void frequence(String str) {
        Map<Character, Integer> charFrequency = new LinkedHashMap<>();

        for (char each : str.toCharArray()) {
            if (charFrequency.containsKey(each)) {
                charFrequency.put(each, charFrequency.get(each) + 1);
            } else {
                charFrequency.put(each, 1);
            }

        }
        charFrequency.forEach((key, value) ->
                System.out.print(key + "" + value));
    }
}
