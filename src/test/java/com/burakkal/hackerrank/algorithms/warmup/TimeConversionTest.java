package com.burakkal.hackerrank.algorithms.warmup;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Burak on 13.2.2017.
 */
public class TimeConversionTest {

    @Test
    public void convert070545PMas190545(){
        assertEquals("19:05:45", TimeConversion.convertTime("07:05:45PM"));
    }

    @Test
    public void convert115959PMas235959(){
        assertEquals("23:59:59", TimeConversion.convertTime("11:59:59PM"));
    }

    @Test
    public void convert120000PMas120000(){
        assertEquals("12:00:00", TimeConversion.convertTime("12:00:00PM"));
    }

    @Test
    public void convert120000AMas000000(){
        assertEquals("00:00:00", TimeConversion.convertTime("12:00:00AM"));
    }
}