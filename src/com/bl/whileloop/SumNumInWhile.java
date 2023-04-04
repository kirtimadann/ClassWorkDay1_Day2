package com.bl.whileloop;

public class SumNumInWhile {

   static int num = 5;
  static int sum;

    public static void main(String[] args) {

        int num = 1;
        while (num <= 5){
            sum = sum + num;
            System.out.print(num + "+" + "");

            num++;
        }

        System.out.print("TotalSum" + "=" + sum);
   }

}
