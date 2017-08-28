package com.burakkal.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class BonAppetit {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int b = in.nextInt();

        int overchargedAmount = getOverchargedAmount(n, k, arr, b);

        if (overchargedAmount == 0) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(overchargedAmount);
        }

    }

    private static int getOverchargedAmount(int n, int k, int[] arr, int b) {
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        int actual = (sum - arr[k]) / 2;
        return b - actual;
    }
}
