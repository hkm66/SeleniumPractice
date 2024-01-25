package com.group.tests.elif.week07_tasks;

import java.util.Arrays;

public class Descending {

    public static void sortDescending(int[] numbers) {


        int n = numbers.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers[j] < numbers[j + 1]) {


                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] array = {8,-1,5,9,20};
        sortDescending(array);
        System.out.println(Arrays.toString(array));

    }
}
