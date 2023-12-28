package com.group.tests.Sumeyra.week6JavaPractice;

public class passwordValidation {

    public static void main(String[] args) {


        System.out.println(passwordValidation("Sumeyra123! "));
    }

    public static boolean passwordValidation(String password){

        if(password.contains(" ")){

            System.out.println("Invalid Password");
            return false;
        }
        boolean hasAtLeast6Chars = password.length() >=6;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);
            if(Character.isUpperCase(ch)){
                hasUpperCase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;

            }else {
                hasSpecialChar = true;
            }

        }

        boolean isStrongPassword = hasAtLeast6Chars && hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;

        if(isStrongPassword=true) {
            return true;
        }



        return isStrongPassword;

    }




}
