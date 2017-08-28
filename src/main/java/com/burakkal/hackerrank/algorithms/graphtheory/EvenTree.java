package com.burakkal.hackerrank.algorithms.graphtheory;

import java.util.Scanner;

public class EvenTree {

    static class Node {
        int weight;
        Node parent;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        Node[] nodes = new Node[n];

        for (int i = 0; i < n; i++) {
            Node node = new Node();
            node.parent = null;
            node.weight = 1;
            nodes[i] = node;
        }

        for (int i = 0; i < m; i++) {
            int childNodeIndex = in.nextInt() - 1;
            int parentNodeIndex = in.nextInt() - 1;
            nodes[childNodeIndex].parent = nodes[parentNodeIndex];
        }

        for (int i = n - 1; i > 0; i--) {
            if (nodes[i].parent != null) {
                nodes[i].parent.weight += nodes[i].weight;
            }
        }

        int numOfRemovedEdges = 0;

        for (int i = 0; i < n; i++) {
            if (nodes[i].parent != null && nodes[i].weight % 2 == 0) {
                numOfRemovedEdges++;
            }
        }

        System.out.println(numOfRemovedEdges);

    }
}
