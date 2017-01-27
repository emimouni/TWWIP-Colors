package com.company;

import java.util.*;

/**
 * Created by emimo on 1/25/2017.
 */
public class RGB {
    public static String getRGBfromHexa(String Hexa) {
        Scanner kb = new Scanner(System.in);
        int r1 = 0, r2 = 0, r3 = 0, r4 = 0, r5 = 0, r6 = 0;
        int x;
        for (int i = 1; i <= 6; i++) {
            String s = Hexa.substring(i - 1, i);
            if (s.equals("A")) {
                x = 10;
            } else if (s.equals("B")) {
                x = 11;
            } else if (s.equals("C")) {
                x = 12;
            } else if (s.equals("D")) {
                x = 13;
            } else if (s.equals("E")) {
                x = 14;
            } else if (s.equals("F")) {
                x = 15;
            } else {
                x = Integer.parseInt(s);
            }

            if (i == 1) r1 = x;
            if (i == 2) r2 = x;
            if (i == 3) r3 = x;
            if (i == 4) r4 = x;
            if (i == 5) r5 = x;
            if (i == 6) r6 = x;

        }
        int red = (r1 * 16) + r2;
        String Red = Integer.toString(red);
        int green = (r3 * 16) + r4;
        String Green = Integer.toString(green);
        int blue = (r5 * 16) + r6;
        String Blue = Integer.toString(blue);
        String RGB = Red + "," + Green + "," + Blue;
        return RGB;
    }
}
