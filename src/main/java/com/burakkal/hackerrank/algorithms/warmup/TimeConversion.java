package com.burakkal.hackerrank.algorithms.warmup;

import java.util.Scanner;

/**
 * Created by Burak on 13.2.2017.
 */
public class TimeConversion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();

        String convertedTime = convertTime(time);

        System.out.println(convertedTime);
    }

    public static String convertTime(String time) {

        String sHour = time.substring(0,2);
        int hour = Integer.valueOf(sHour);
        String format = time.substring(8,9);

        if(hour == 12) {
            if(format.equals("A"))
                hour = 0;
        } else if(format.equals("P")) {
            hour += 12;
        }

        return String.format("%02d%s", hour, time.substring(2,8));

    }
}
