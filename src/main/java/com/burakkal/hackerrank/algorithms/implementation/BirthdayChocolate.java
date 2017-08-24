package com.burakkal.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class BirthdayChocolate {

    // O(n)

    private static int getWaysWithLinearTime(int n, int[] s, int d, int m) {

        if (m > n)
            return 0;

        int[] sum = new int[n+1];
        int result = 0;
        sum[0] = 0;

        for (int i = 0; i < n; i++) {
            sum[i+1] = sum[i] + s[i];
        }

        for (int i = 0; i <= n - m; i++) {
            if(sum[i+m] - sum[i] == d) result++;
        }

        return result;
    }

    // O(n*n)

    private static int getWaysWithQuadraticTime(int n, int[] s, int d, int m) {

        if (m > n)
            return 0;

        int sum;
        int result = 0;

        for (int i = 0; i <= n - m; i++) {
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

        int result = getWaysWithLinearTime(n, s, d, m);

        System.out.println(result);
    }

}
