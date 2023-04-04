package com.bl.forloop;

public class PalindromNumber {

    public static void main(String[] args) {
        int number = 321;
        int r = 0;

        int temp = number;
        while (number>0){

            int digit = number % 10;
            r = r * 10 + digit;
             number = number / 10;
        }

        if (temp == r){
            System.out.println(" is palindrow");
        }else {
            System.out.println("this num is not not not palindrow");
        }
    }
}
