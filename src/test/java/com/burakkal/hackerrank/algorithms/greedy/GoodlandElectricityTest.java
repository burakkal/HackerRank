package com.burakkal.hackerrank.algorithms.greedy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Burak on 14.2.2017.
 */
public class GoodlandElectricityTest {

    @Test
    public void testCase1() {

        int[] array = {0,1,0};
        int range = 2;

        assertEquals(1, GoodlandElectricity.findMinNumberOfCitiesThatSwitchOn(array, range));

    }

    @Test
    public void testCase2() {

        int[] array = {1,0,1};
        int range = 2;

        assertEquals(2, GoodlandElectricity.findMinNumberOfCitiesThatSwitchOn(array, range));

    }

    @Test
    public void testCase3() {

        int[] array = {0,0,0,1};
        int range = 2;

        assertEquals(-1, GoodlandElectricity.findMinNumberOfCitiesThatSwitchOn(array, range));

    }

    @Test
    public void testCase4() {

        int[] array = {0,1,1,1,1,0};
        int range = 2;

        assertEquals(2, GoodlandElectricity.findMinNumberOfCitiesThatSwitchOn(array, range));

    }

    @Test
    public void testCase5() {

        int[] array = {0,1,1,0,0};
        int range = 2;

        assertEquals(-1, GoodlandElectricity.findMinNumberOfCitiesThatSwitchOn(array, range));

    }



    @Test
    public void testCase6() {

        int[] array = {0,1,1,0,0};
        int range = 4;

        assertEquals(1, GoodlandElectricity.findMinNumberOfCitiesThatSwitchOn(array, range));

    }
}