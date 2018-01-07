package com.nats.strings;

/**
 * Created by nataraja.maruthi on 1/6/18.
 */
public class BiggerVersion {
    public static void main(String[] args) {
        System.out.println(getBiggerVersion("1.0.0", "0.01.01"));

    }

    private static String getBiggerVersion(String s1, String s2) {
        String[] s1Split = s1.split("\\.");
        String[] s2Split = s2.split("\\.");
        int size = s1Split.length > s2Split.length ? s2Split.length:s1Split.length;
        int i = 0;
        while (i<size) {
            if (Integer.parseInt(s1Split[i]) > Integer.parseInt(s2Split[i])) {
                return s1;
            } else if (Integer.parseInt(s1Split[i]) < Integer.parseInt(s2Split[i])){
                return s2;
            }
            i++;
        }
        return s1;
    }

}