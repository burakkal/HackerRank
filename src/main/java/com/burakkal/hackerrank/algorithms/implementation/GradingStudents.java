package com.burakkal.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class GradingStudents {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 0; i < n; i++) {

            int grade = in.nextInt();

            if(grade >= 38 && grade%5-3 >= 0)
                grade += (5-grade%5);

            System.out.println(grade);
        }

    }
}
