package com.bl.whileloop;

public class ReverceInWhileLoop {

    public static void main(String[] args) {

        int number = 231;
        int reverce = 0;
        System.out.println("origanal no :" + number);
        while (number != 0){

            int digit = number % 10;
            reverce = reverce * 10 + digit;

            number /= 10;
        }


        System.out.println("Reverce no :" + reverce);
    }

}
