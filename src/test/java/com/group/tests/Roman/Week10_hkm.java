package com.group.tests.Roman;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Week10_hkm {

    public static String freqOfEachElement(String str) {
        var map = new LinkedHashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            var ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        String result = "";
        for (Character key : map.keySet()) {
            result += key;
            result += map.get(key);
        }

        return result;
    }

    public static int minValueFromMap(Map<Integer, Integer> map) {
        var queue = new PriorityQueue<Integer>();
        queue.addAll(map.values());
        return queue.peek();
    }
}
