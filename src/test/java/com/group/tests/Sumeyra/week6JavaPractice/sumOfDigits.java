package com.group.tests.Sumeyra.week6JavaPractice;

public class sumOfDigits {
    public static void main(String[] args) {

        System.out.println(sumOfDigits(12345));

    }

    public static String sumOfDigits(int n){

        int sum = 0;

        while(n != 0){

            sum += n % 10;

            n /= 10;
        }

        return String.valueOf(sum);

    }
























}
