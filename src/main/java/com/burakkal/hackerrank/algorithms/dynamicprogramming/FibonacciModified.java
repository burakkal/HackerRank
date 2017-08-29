package com.burakkal.hackerrank.algorithms.dynamicprogramming;

import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciModified {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        BigInteger t1 = in.nextBigInteger();
        BigInteger t2 = in.nextBigInteger();
        int n = in.nextInt();

        System.out.println(fibonacciWithDp(t1, t2, n));


    }

    private static BigInteger fibonacciWithDp(BigInteger t1, BigInteger t2, int n) {

        BigInteger[] fib = new BigInteger[n];
        fib[0] = t1;
        fib[1] = t2;
        for (int i = 2; i < n; i++) {
            fib[i] = (fib[i-1].pow(2)).add(fib[i-2]);
        }
        return fib[n-1];
    }

}
