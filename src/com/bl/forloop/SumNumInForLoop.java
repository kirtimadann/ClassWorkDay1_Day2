package com.bl.forloop;

public class SumNumInForLoop {
    static int num;
    static int sum;
    public static void main(String[] args) {

        for (int num = 1; num <= 5; num++){
            sum = sum + num;
            System.out.print(num + "+" + "");
        }
        System.out.print("TotalSum" + "=" + sum);

        }
    }

