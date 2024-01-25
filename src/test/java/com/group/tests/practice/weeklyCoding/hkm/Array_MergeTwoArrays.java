package com.group.tests.practice.weeklyCoding.hkm;

import java.util.Arrays;

public class Array_MergeTwoArrays {

    /*
    Write a return method that can concat two arrays
     */
    public static void main(String[] args) {
        int [] a={0,1,2,3,4,5};
        int[] b= {6,7,8,9};
        System.out.println(Arrays.toString(concatTwoArrays(a,b)));
    }
    public static int[] concatTwoArrays(int[] arr1, int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];

        int i = 0;
        for (int each : arr1) {
            result[i++] = each;
        }

        for (int each : arr2) {
            result[i++] = each;
        }

        return result;

    }

}
