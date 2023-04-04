package com.bl.forloop;

public class ReverceInForloop {
    public static void main(String[] args) {
        int number = 231;
        int reverce = 0;
        System.out.println("Origanal No :" + number);
        for (; number != 0; number /= 10){

            int digit = number % 10;
            reverce = reverce * 10 + digit;
        }

        System.out.println("Reverse No :" + reverce);
    }

}
