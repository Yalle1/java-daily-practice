package com.yalle1.practice1;

public class CountWords {

    public static void main(String[] args) {

        wordCount("Hello boys, how are we doing!?");

    }

    public static void wordCount(String sentence){

        sentence = sentence.trim();

        int count = 0;
        for (String s : sentence.split(" ")) {
            count++;
        }

        System.out.println("There are "+count+" words in the sentence");

    }
}
