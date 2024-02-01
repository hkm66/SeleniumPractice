package com.group.tests.Roman;

import java.util.List;

public class Week9_hkm {

    public static int[] concatArrays(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i];
        }

        for (int i = 0, j = array1.length; i < array2.length; i++, j++) {
            result[j] = array2[i];
        }

        return result;
    }

    public static List<String> removeFromList(List<String> names, String nameToRemove) {
        names.removeIf(m -> m.equals(nameToRemove));
        return names;
    }

    public static List<Integer> removeGreaterThan(List<Integer> listOfNumbers, int value) {
        listOfNumbers.removeIf(m -> m > value);
        return listOfNumbers;
    }
}
