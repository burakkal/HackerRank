package com.burakkal.hackerrank.algorithms.greedy;

import java.util.Scanner;

/**
 * Created by Burak on 14.2.2017.
 */
public class GoodlandElectricity {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int cities[] = new int[N];

        for (int i = 0; i < N; i++) {
            cities[i] = scanner.nextInt();
        }

        int min = findMinNumberOfCitiesThatSwitchOn(cities, K);

        System.out.println(min);

    }

    public static int findMinNumberOfCitiesThatSwitchOn(int[] cities, int range) {

        int numberOfCities = cities.length;
        boolean hasElectricTower = false;

        for (int i = 0; i < numberOfCities; i++) {
            if(cities[i] == 1) {
                hasElectricTower = true;
                break;
            }
        }

        if(!hasElectricTower)
            return -1;
        else if(numberOfCities == range)
            return 1;

        int switchOn = 0;
        int coverIndex = range - 1;
        int intervalIndex = 0;
        int intervalLastIndex;

        while(coverIndex < numberOfCities) {

            if(coverIndex < intervalIndex) {
                switchOn = -1;
                break;
            }

            if(cities[coverIndex] == 1) {
                switchOn++;
                intervalIndex = coverIndex + 1;
                intervalLastIndex = coverIndex + range;
                coverIndex += 2*range - 1;
                if(coverIndex >= numberOfCities && intervalIndex < numberOfCities
                        && intervalLastIndex < numberOfCities)
                    coverIndex = numberOfCities - 1;
            } else {
                coverIndex--;
            }

        }

        return switchOn;

    }
}
