package com.group.tests.practice.weeklyCoding.Yasemin;

import java.sql.Array;
import java.util.Arrays;

public class Week7_Tasks {

    /*Array - Find Minimum
Write a method that can find the maximum number from an int Array

     */

    public static void findMinNumber(int[] numbers){
        int min=numbers[0];
        for (int each : numbers) {
            if (each<min){
                min=each;
            }
        }
        System.out.println("Mininum number is : "+min);
    }

    /*
    Array - Sort Ascending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};
     */
    public static void ascendingArray(int[] numbers){
        int smaller;

        for (int i = 0; i <numbers.length-1; i++) {
            for (int j = 0; j <numbers.length-1 ; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    smaller = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = smaller;

                }
            }

        }
        System.out.println("Ascending Array is : "+ Arrays.toString(numbers));
    }

    /*
    Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
arr = Sort(arr); ==> {90, 20, 10, 8, 7};

     */
    public static void descendingArray(int[] numbers){
        int bigger;

        for (int i = 0; i <numbers.length-1; i++) {
            for (int j = 0; j <numbers.length-1 ; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    bigger = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = bigger;

                }
            }
        }
        System.out.println("Descending Array is : "+ Arrays.toString(numbers));
    }



}
