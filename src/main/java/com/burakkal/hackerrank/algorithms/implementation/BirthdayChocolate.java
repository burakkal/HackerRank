package com.burakkal.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class BirthdayChocolate {

    private static int getWays(int n, int[] s, int d, int m) {

        int sum;
        int result = 0;

        if (m > n)
            return 0;

        for (int i = 0; i < n-m+1; i++) {
            sum = 0;

            for (int j = 0; j < m; j++) {
                sum += s[i + j];
            }

            if (sum == d) result++;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] s = new int[n];

        for (int i = 0; i < n; i++) {
            s[i] = in.nextInt();
        }

        int d = in.nextInt();
        int m = in.nextInt();

        int result = getWays(n, s, d, m);

        System.out.println(result);
    }

}
