package com.day1problems;

public class SaticVarMethod {

    static int a;
    static int b;
    static int c;
    static void add( int a,int b){
        c = a + b;
        System.out.println(c);
    }
    public static void main(String[] args) {
     add(12 ,23);
    }
}
