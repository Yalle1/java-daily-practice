package com.yalle1;

import java.util.*;

public class MaxElementInArray {

    public static void main(String[] args) {

        int[] a = {1,2,3,4,5,6,7,8,9};

        max(a);  // This method uses a for-loop to iterate through each element
        max2(a); // This method uses stream() to return the max

    }

    public static void max(int[] arr){

        int max = Integer.MIN_VALUE; // pre-condition for lowest allowed element value

        for (int i : arr) {
            if (i > max){
                max = i;
            }
        }

        System.out.println("Max value is: " + max);

    }

    public static void max2(int[] arr){

        int i = Arrays.stream(arr).max().getAsInt();

        System.out.println("Max value is: " + i);

    }
}
