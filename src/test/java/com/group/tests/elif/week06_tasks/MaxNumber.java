package com.group.tests.elif.week06_tasks;

public class MaxNumber {

    public static int maxNumber(int[] n){

        int max = Integer.MIN_VALUE;

        for (int each : n) {
            if(each > max){
                max = each;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int [] array = {-1, -5 , 19 ,40, 23 ,0};
        int maximumNumber = maxNumber(array);
        System.out.println("maximumNumber = " + maximumNumber);
    }
}
