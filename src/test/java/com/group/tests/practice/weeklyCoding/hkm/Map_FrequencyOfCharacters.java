package com.group.tests.practice.weeklyCoding.hkm;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_FrequencyOfCharacters {

    /*
    Write a method that prints the frequency of each character from a String
     */
    public static void main(String[] args) {
        FrequencyTest("abfffffkghtrkrrr");
    }
    public static void FrequencyTest(String  str ) {

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (Character each : str.toCharArray()) {

            if (map.containsKey(each)) {
                map.put(each, map.get(each) + 1);
                System.out.println(map.get(each));
            } else {
                map.put(each, 1);
            }

        }

        System.out.println(map);

    }



}
