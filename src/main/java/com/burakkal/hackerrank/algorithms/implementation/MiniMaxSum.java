package com.burakkal.hackerrank.algorithms.implementation;

import java.util.Scanner;

/**
 * Created by Burak on 15.2.2017.
 */
public class MiniMaxSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long nums[] = new long[5];
        for (int i = 0; i < 5; i++) {
            nums[i] = scanner.nextLong();
        }

        long min = Long.MAX_VALUE;
        long max = 0;
        long sumAll = nums[0] + nums[1] + nums[2] + nums[3] + nums[4];
        long sum;

        for (int i = 0; i < 5; i++) {

            sum = sumAll - nums[i];

            if(sum < min)
                min = sum;
            if(sum > max)
                max = sum;
        }


        System.out.println(min + " " + max);
    }
}
