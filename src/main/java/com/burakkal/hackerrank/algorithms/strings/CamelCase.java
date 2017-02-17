package com.burakkal.hackerrank.algorithms.strings;

import java.util.Scanner;

/**
 * Created by Burak on 17.2.2017.
 */
public class CamelCase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        int numberOfWords = getNumberOfWordsFrom(s);

        System.out.println(numberOfWords);

    }

    public static int getNumberOfWordsFrom(String s) {

        int numberOfWords = 1;
        int upperCaseCharStart = 65;
        int upperCaseCharEnd = 90;

        for (int i = 0; i < s.length(); i++) {
            int letter = s.charAt(i);
            if(letter >= upperCaseCharStart && letter <= upperCaseCharEnd)
                numberOfWords++;
        }

        return numberOfWords;
    }
}
