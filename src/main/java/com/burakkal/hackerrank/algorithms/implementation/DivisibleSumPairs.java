package com.burakkal.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class DivisibleSumPairs {

    static int divisibleSumPairs(int n, int k, int[] arr) {
        int numValidPairs = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if((arr[i] + arr[j]) % k == 0) numValidPairs++;
            }
        }
        return numValidPairs;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int result = divisibleSumPairs(n, k, arr);

        System.out.println(result);

    }
}
