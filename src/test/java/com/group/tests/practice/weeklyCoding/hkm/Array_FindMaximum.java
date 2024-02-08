package com.group.tests.practice.weeklyCoding.hkm;

import java.util.Arrays;

public class Array_FindMaximum {
    /*
        Write a function that can find the maximum number from an int Array
     */


    public int maxValue(int[] m) {

        int max = Integer.MIN_VALUE;

        for (int each : m) {
            if (each > max) {
                max = each;
            }
        }

        return max;
    }

    // Solution 2:
    public static int maxVal( int[]  n ) {
        Arrays.sort( n );
        return  n [ n.length -1 ];
    }


}
