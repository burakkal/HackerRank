package com.burakkal.hackerrank.algorithms.strings;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Burak on 17.2.2017.
 */
public class CamelCaseTest {

    @Test
    public void getOneForStringWithAWord() {

        String s = "hello";

        assertEquals(1, CamelCase.getNumberOfWordsFrom(s));

    }

    @Test
    public void getTwoForStringWithTwoWords() {

        String s = "helloWorld";

        assertEquals(2, CamelCase.getNumberOfWordsFrom(s));

    }

    @Test
    public void getThreeForStringWithThreeWords() {

        String s = "saveChangesIn";

        assertEquals(3, CamelCase.getNumberOfWordsFrom(s));

    }

    @Test
    public void getFourForStringWithFourWords() {

        String s = "saveChangesInThe";

        assertEquals(4, CamelCase.getNumberOfWordsFrom(s));

    }

    @Test
    public void getFiveForStringWithFiveWords() {

        String s = "saveChangesInTheEditor";

        assertEquals(5, CamelCase.getNumberOfWordsFrom(s));

    }
}