package com.burakkal.hackerrank.algorithms.implementation;

import java.util.Scanner;

/**
 * Created by Burak on 17.2.2017.
 */
public class AppleAndOrange {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int S = in.nextInt();
        int T = in.nextInt();
        int A = in.nextInt();
        int B = in.nextInt();
        int M = in.nextInt();
        int N = in.nextInt();
        int[] apple = new int[M];
        for(int apple_i=0; apple_i < M; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[N];
        for(int orange_i=0; orange_i < N; orange_i++){
            orange[orange_i] = in.nextInt();
        }

        House house = new House(S, T);
        Tree appleTree = new Tree(A);
        Tree orangeTree = new Tree(B);

        int numberOfApplesFallOnHouse = getNumberOfFruitFallOnHouse(house, appleTree, apple);
        int numberOfOrangesFallOnHouse = getNumberOfFruitFallOnHouse(house, orangeTree, orange);

        System.out.println(numberOfApplesFallOnHouse);
        System.out.println(numberOfOrangesFallOnHouse);
    }

    public static int getNumberOfFruitFallOnHouse(House house, Tree tree, int[] fallDistances) {

        int numberOfFruitFallOnHouse = 0;

        for (int i = 0; i < fallDistances.length; i++) {
            int fallOnPoint = tree.getPoint() + fallDistances[i];
            if(fallOnPoint >= house.getStartPoint() && fallOnPoint <= house.getEndPoint())
                numberOfFruitFallOnHouse++;
        }

        return numberOfFruitFallOnHouse;
    }

    public static class House {

        private int startPoint;
        private int endPoint;

        public House(int startPoint, int endPoint) {
            this.startPoint = startPoint;
            this.endPoint = endPoint;
        }

        public int getStartPoint() {
            return startPoint;
        }
        public int getEndPoint() {
            return endPoint;
        }

    }

    public static class Tree {

        private int point;

        public Tree(int point) {
            this.point = point;
        }
        public int getPoint() {
            return point;
        }

    }

}
