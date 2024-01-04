package com.group.tests.Sumeyra.week7;

public class minNumber {

    public static void main(String[] args) {

        int [] numbers = {100, 20, 500, 40, -10, 30};

        minNumber(numbers);

    }

    public static void minNumber(int[] numbers) {

        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if(numbers[i] <min){

                min = numbers[i];
            }

        }

        System.out.println(min);
    }
}
