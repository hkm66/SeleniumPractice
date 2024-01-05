package com.group.tests.practice.weeklyCoding.Yasemin;

import java.util.Arrays;

public class Week6_Tasks {

    /*
    String -- Password Validation Task
1. Write a return method that can verify if a password is valid or not.
requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns false
     */

    public static boolean passwordValidation(String password) {
        int upperCase=0;
        int lowerCase=0;
        int digit=0;
        int specialChar=0;
        if (password.length() >= 6 && !(password.contains(" "))) {
            for (int i = 0; i < password.length() - 1; i++){
                char c=password.charAt(i);
                if(Character.isUpperCase(c)){
                    upperCase++;
                } if(Character.isLowerCase(c)){
                    lowerCase++;
                }if(Character.isDigit(c)){
                    digit++;
                }if(c>=33&&c<=46||c==64){
                    specialChar++;
                }
            }
            if(upperCase>0 && lowerCase>0 && digit>0 && specialChar>0){
                return true;
            }else return false;

        }else return false;


    }

    /*
    Array -- Find Maximum
Write a method that can find the maximum number from an int Array
     */

    public static void findMaxNumber(int[] numbers){
        int max=numbers[0];
        for (int each : numbers) {
            if (each>max){
                max=each;
            }
        }
        System.out.println(max);
    }

    /*
    String -- sum of digits in a string
Write a method that can return the sum of the digits in a string
     */

    public static void sumOfDigitInString(String word){
        int sum =0;
        for (int i = 0; i <word.length() ; i++) {
            char c=word.charAt(i);
            if(Character.isDigit(c)){
                sum += Integer.parseInt(String.valueOf(c));
            }else continue;

        }
        System.out.println(sum);
    }
}


