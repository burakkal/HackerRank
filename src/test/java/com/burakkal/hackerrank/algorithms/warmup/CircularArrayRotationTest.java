package com.burakkal.hackerrank.algorithms.warmup;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Burak on 13.2.2017.
 */
public class CircularArrayRotationTest {

    @Test
    public void rotateArrayOneTime() {
        int[] actual = {1,2,3};
        int[] expected = {3,1,2};

        assertArrayEquals(expected, CircularArrayRotation.rotateArray(actual,1));
    }

    @Test
    public void rotateArrayTwice() {
        int[] actual = {1,2,3};
        int[] expected = {2,3,1};

        assertArrayEquals(expected, CircularArrayRotation.rotateArray(actual,2));
    }

    @Test
    public void rotateArrayThreeTime() {
        int[] actual = {1,2,3};
        int[] expected = {1,2,3};

        assertArrayEquals(expected, CircularArrayRotation.rotateArray(actual,3));
    }

    @Test
    public void rotateArrayFourTime() {
        int[] actual = {1,2,3,4,5,6};
        int[] expected = {3,4,5,6,1,2};

        assertArrayEquals(expected, CircularArrayRotation.rotateArray(actual,4));
    }
}