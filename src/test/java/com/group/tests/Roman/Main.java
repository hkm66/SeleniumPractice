package com.group.tests.Roman;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(3,5,2,6,1));
        System.out.println(Week11_hkm.sortArrayInAscRecurs(arrayList));
        System.out.println(Week11_hkm.sortArrayInAsc(arrayList));

        System.out.println(Week11_hkm.sortArrayInDescRecurs(arrayList));
        System.out.println(Week11_hkm.sortArrayInDesc(arrayList));

        var map = new HashMap<Integer, Integer>();
        map.put(1, 5);
        map.put(2, 7);
        map.put(3, 3);
        map.put(4, 4);
        map.put(5, 1);
        map.put(6, 2);
        map.put(7, 4);
        System.out.println(Week11_hkm.sortedMapByValues(map));
    }
}
