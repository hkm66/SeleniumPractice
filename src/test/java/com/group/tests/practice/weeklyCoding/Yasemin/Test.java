package com.group.tests.practice.weeklyCoding.Yasemin;

public class Test {
    public static void main(String[] args) {
        System.out.println("--------------------Unique Character---------------");
        Week5_Task.findUniqueCharacter("AABBBCCCDDEFG");


        System.out.println("--------------------String Reverse---------------");
        Week5_Task.stringReverse("ABC");

        System.out.println("--------------------Password validation---------------");
        System.out.println(Week6_Tasks.passwordValidation("asdd3.k"));

        System.out.println("--------------------Array Max Number---------------");
        Week6_Tasks.findMaxNumber(new int[]{3,5,15,7,9});

        System.out.println("--------------------Sum of digit in String---------------");
        Week6_Tasks.sumOfDigitInString("1er8ty1");

        System.out.println("--------------------Array Min Number---------------");
        Week7_Tasks.findMinNumber(new int[]{3,5,15,7,9});

        System.out.println("--------------------Ascending Array Without Sort()---------------");
        Week7_Tasks.ascendingArray(new int[]{4,5,7,2,9,1});

        System.out.println("--------------------Descending Array Without Sort()---------------");
        Week7_Tasks.descendingArray(new int[]{4,5,7,2,9,1});




    }
}
