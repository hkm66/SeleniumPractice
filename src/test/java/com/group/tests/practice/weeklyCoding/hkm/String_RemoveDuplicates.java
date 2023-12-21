package com.group.tests.practice.weeklyCoding.hkm;

import java.util.LinkedHashMap;

public class String_RemoveDuplicates {
    /*
    Write function that can remove the duplicated values from String
            Ex: removeDup("AAABBBCCC") ==> ABC
     */

    public String removeDup(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (!result.contains("" + str.charAt(i))) {
                result += "" + str.charAt(i);
            }
        }

        return result;
    }

//Roman's solution
    public static String uniqueChars(String str) {
        var map = new LinkedHashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            var ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        String result = "";
        for (var ch : map.keySet()) {
            if (map.get(ch) == 1)
                result += ch;
        }

        return result;
    }


}
