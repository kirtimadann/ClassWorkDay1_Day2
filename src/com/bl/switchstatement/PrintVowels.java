package com.bl.switchstatement;

public class PrintVowels {

    public static void main(String[] args) {
        char ch = 'a';

        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':

                System.out.println("This is Vowels");
                break;

            default:{

                System.out.println("this Char are not vowel");

            }
        }

    }
}
