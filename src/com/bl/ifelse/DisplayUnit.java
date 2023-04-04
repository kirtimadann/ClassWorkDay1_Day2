package com.bl.ifelse;

public class DisplayUnit {

    static int num =10;
    static int num2 = 1000 % 10;
    public static void main(String[] args) {

        if(num == 1){
            System.out.println("one");
        } else if (num == 10) {

            System.out.println("Ten");
        } else if (num == 100) {

            System.out.println("hundred");

        } else if (num == 1000) {

            System.out.println("ten hundred");

        } else {
            System.out.println("Not Valid Number");

        }

        System.out.println("Unit :" + num2);

    }
}
