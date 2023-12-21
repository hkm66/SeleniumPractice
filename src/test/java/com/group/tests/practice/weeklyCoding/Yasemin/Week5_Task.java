package com.group.tests.practice.weeklyCoding.Yasemin;

public class Week5_Task {
    /*
    String -- Find the unique
Write a return method that can find the unique characters from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";

     */
    public static void findUniqueCharacter(String str){
       String result="";
       int count;

        for (int i = 0; i <str.length() ; i++) {
            count=0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)) {
                    count++;
                }
            }
            if(count==1) {
                result += "" + str.charAt(i);
            }
        }
        System.out.println(result);
    }



    /*
    String -- Reverse
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA
     */
    public static void stringReverse(String str){
        String reverse="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverse +=str.charAt(i);

        }
        System.out.println(reverse);
    }
}
