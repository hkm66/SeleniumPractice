package com.group.tests.Roman;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(3,5,2,6,1));
        System.out.println(Week11_hkm.sortArrayInAscRecurs(arrayList));
        System.out.println(Week11_hkm.sortArrayInAsc(arrayList));

        System.out.println(Week11_hkm.sortArrayInDescRecurs(arrayList));
        System.out.println(Week11_hkm.sortArrayInDesc(arrayList));
    }
}
