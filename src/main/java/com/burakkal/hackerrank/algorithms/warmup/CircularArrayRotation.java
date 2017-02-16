package com.burakkal.hackerrank.algorithms.warmup;

import java.util.Scanner;

/**
 * Created by Burak on 13.2.2017.
 */
public class CircularArrayRotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] m = new int[q];
        for(int a0 = 0; a0 < q; a0++){
            m[a0] = in.nextInt();
        }

        int[] rotatedArray = rotateArray(a, k);

        for (int i = 0; i < q; i++) {
            System.out.println(rotatedArray[m[i]]);
        }

    }

    public static int[] rotateArray(int[] array, int time) {

        int length = array.length;
        time = time % length;

        int[] rArray = new int[length];
        int index = time;

        for (int i = 0; i < length; i++) {
            if(index == length) index = 0;
            rArray[index++] = array[i];
        }

        return rArray;

    }
}
