package com.day1problems;

public class LeapYear {
    public static void main(String[] args) {

         int year = 2000;
         if ((year % 4 == 0) && (year % 100 != 0 || (year % 400 == 0))){

             System.out.println("year is leap");
         }else {
             System.out.println("year is not leap");
         }


    }
}
