package com.burakkal.hackerrank.algorithms.implementation;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Burak on 20.2.2017.
 */
public class BetweenTwoSets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b);

        int firstBound = a[n-1];
        int lastBound = b[0];
        int count = 0;

        for(int i=firstBound; i <= lastBound; i++) {

            int sum = 0;

            for(int j=0; j < n; j++)
                sum += i % a[j];

            for(int k=0; k < m; k++)
                sum += b[k] % i;

            if(sum == 0)
                count++;

        }

        System.out.print(count);
    }
}
