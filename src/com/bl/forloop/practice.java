package com.bl.forloop;

public class practice {

    public static void main(String[] args) {

        int number = 321;
        int reverce = 0;
        int temp = number;

        while (number > 0){

            int digit = number % 10;
            reverce = reverce * 10 + digit;

            number = number / 10;
        }

        if (temp == reverce){
            System.out.println("Num Is PalindrowNum");
        }else {
            System.out.println("this is not palindrrpw num");
        }
    }
}
