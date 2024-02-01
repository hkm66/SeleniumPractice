package com.group.tests.Roman;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        var str = "aabbbccddd";
        System.out.println(Week10_hkm.freqOfEachElement(str));

        var map = new HashMap<Integer, Integer>();
        map.put(1, 16);
        map.put(2, 9);
        map.put(3, 12);
        map.put(4, 6);
        map.put(5, 11);

        System.out.println(Week10_hkm.minValueFromMap(map));
    }
}
