package com.burakkal.hackerrank.algorithms.implementation;

import java.util.Scanner;

/**
 * Created by Burak on 17.2.2017.
 */
public class Kangaroo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();

        boolean canCatch = canCatchTheOtherKangaroo(x1, v1, x2, v2);

        if(canCatch)
            System.out.print("YES");
        else
            System.out.print("NO");


    }

    public static boolean canCatchTheOtherKangaroo(int x1, int v1, int x2, int v2) {
        if(x1 < x2 && v1 < v2)
            return false;

        if(x1 > x2 && v1 > v2)
            return false;

        if(v1 == v2)
            return false;

        int minusPerJump = v1 - v2 < 0 ? v2 - v1 : v1 - v2;
        int minusFirstPosition = x1 - x2 < 0 ? x2 - x1 : x1 - x2;

        return minusFirstPosition % minusPerJump == 0;
    }
}
