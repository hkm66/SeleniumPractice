package com.group.tests.elif.week07_tasks;

import java.util.Arrays;

public class Ascending {
// 1  0 3 5 4

    public static void sortAscending(int[] numbers) {


            int n = numbers.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (numbers[j] > numbers[j + 1]) {


                        int temp = numbers[j];
                        numbers[j] = numbers[j + 1];
                        numbers[j + 1] = temp;
                    }
                }
            }
    }

    public static void main(String[] args) {
        int [] array = {10, 9, 8, 7};
        sortAscending(array);
        System.out.println(Arrays.toString(array));

    }

}
/*
Question2: Array - Sort Ascending
Write a return method that can sort an int array in Ascending order without
using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};
 */
