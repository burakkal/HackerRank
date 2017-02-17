package com.burakkal.hackerrank.algorithms.implementation;

import java.util.Scanner;

/**
 * Created by Burak on 16.2.2017.
 */
public class DesignerPdfViewer {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i=0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();

        int totalArea = getAreaOfHighlightedRectangle(h, word);

        System.out.println(totalArea);

    }

    private static int getAreaOfHighlightedRectangle(int[] h, String word) {

        int wordLength = word.length();
        int maxHeight = 0;

        for (int i = 0; i < wordLength; i++) {
            int index = word.charAt(i) - 97;
            maxHeight = h[index] > maxHeight ? h[index] : maxHeight;
        }

        return maxHeight * wordLength;
    }
}
