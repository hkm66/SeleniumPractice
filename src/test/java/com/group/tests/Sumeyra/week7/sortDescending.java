package com.group.tests.Sumeyra.week7;

import java.util.Arrays;

public class sortDescending {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(sortDescending(10,20,7, 8, 90)));

    }

        public static int[] sortDescending(int... arr){

            for (int i = 0; i< arr.length ; i++) {

                for (int j = 0 ; j < arr.length-1 ; j++) {

                    if(arr[j] < arr[j+1]){

                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;

                    }
                }
            }

            return arr;

        }
}
