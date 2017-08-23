package com.burakkal.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class BreakingTheRecords {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int numBest = 0;
        int numWorst = 0;
        int firstScore = in.nextInt();
        int bestScore = firstScore;
        int worstScore = firstScore;

        for (int i = 1; i < n; i++) {
            int curScore = in.nextInt();
            if (curScore > bestScore) {
                bestScore = curScore;
                numBest++;
            }
            if (curScore < worstScore) {
                worstScore = curScore;
                numWorst++;
            }
        }

        System.out.println(numBest + " " + numWorst);

    }
}
