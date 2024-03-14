package com.yalle1.practice1;

public class IsPalindrome {


    public static void main(String[] args) {

        boolean b1 = isPalindrome("Anna");
        boolean b2 = isPalindrome("Hello");
        boolean b3 = isPalindrome("non");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);



    }

    public static boolean isPalindrome(String str){

        str = str.trim();

        String reversed = "";

        for (int i = str.length()-1; i >= 0; i--){

            reversed += str.charAt(i);

        }

        return reversed.equalsIgnoreCase(str);

    }
}
