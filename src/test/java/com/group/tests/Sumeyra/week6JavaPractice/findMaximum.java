package com.group.tests.Sumeyra.week6JavaPractice;

public class findMaximum {

    public static void main(String[] args) {

        System.out.println(findMax(new int[]{1, 2, 3, 4, 5}));

        System.out.println(findMax(new int[]{1,-3,37,29,0}));

    }

    public static int findMax(int[] numbers){

        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if(numbers[i] >max) {
                max =numbers[i];
            }

        }

        return max;

    }
}
