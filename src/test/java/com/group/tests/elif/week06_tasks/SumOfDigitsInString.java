package com.group.tests.elif.week06_tasks;

public class SumOfDigitsInString {

    public static int sumOfDigitsInString(String str){

        int sum = 0;
        for (char eachChar : str.toCharArray()) {
            if (Character.isDigit(eachChar)) {
                sum +=  Character.getNumericValue(eachChar);
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(sumOfDigitsInString("1a2b3c4d"));
    }

}
