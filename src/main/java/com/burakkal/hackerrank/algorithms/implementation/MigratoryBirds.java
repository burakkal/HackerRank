package com.burakkal.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class MigratoryBirds {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] type = new int[5];

        for (int i = 0; i < n; i++) {
            type[in.nextInt()-1]++;
        }

        int mostCommonType = 1;
        int max = 0;

        for (int i = 0; i < 5; i++) {
            if (type[i] > max) {
                max = type[i];
                mostCommonType = i+1;
            }
        }

        System.out.println(mostCommonType);

    }
}
