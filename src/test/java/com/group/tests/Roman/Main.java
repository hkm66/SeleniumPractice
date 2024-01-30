package com.group.tests.Roman;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {0, 0, 2, 0, 7, 2, 3};
        int[] array2 = {1, 2, 0, 1, 0, 0, 6, 2};
        System.out.println(Arrays.toString(Week9_hkm.concatArrays(array, array2)));



        ArrayList<String> list = new ArrayList<>();
        list.add("Ahmed");
        list.add("John");
        list.add("Eric");
        list.add("Ahmed");

        System.out.println(Week9_hkm.removeFromList(list, "Ahmed"));


        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 95; i < 105; i++) {
            numbers.add(i);
        }
        System.out.println(Week9_hkm.removeGreaterThan(numbers, 100));
    }
}
