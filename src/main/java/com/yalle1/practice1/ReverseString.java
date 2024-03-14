package com.yalle1.practice1;

public class ReverseString {

    public static void main(String[] args) {

        reverse("Hello World");
        // output == dlroW olleH


    }

    public static void reverse(String str){

        String reversed = "";

        for (int i = str.length()-1; i >= 0; i--){

            reversed += str.charAt(i);

        }

        System.out.println(reversed);

    }
}
