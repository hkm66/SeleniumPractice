package com.group.tests.elif.week07_tasks;

public class Minimum {

    public static int minNumber(int[] n){

        int min = Integer.MAX_VALUE;

        for (int each : n) {
            if(each < min){
                min = each;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int [] array = {90,10,20,30,40,50};
        int minimumNumber = minNumber(array);
        System.out.println("minimumNumber = " + minimumNumber);
    }
}
