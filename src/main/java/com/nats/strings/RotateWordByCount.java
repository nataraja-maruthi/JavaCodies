package com.nats.strings;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Created by nataraja.maruthi on 1/7/18.
 */
public class RotateWordByCount {
    public static void main(String[] args) {
        String str = "I am working in Senior SDET";
        rotata2(str,3);
    }

    private static void rotate(String str, int i) {
        String[] split = str.split(" ");
        String [] copy = new String[split.length];
        int index = split.length-i;
        System.arraycopy(split,index,copy,0,split.length-index);
        System.arraycopy(split,0,copy,index,split.length-index);

    }

    private static void rotata2(String str, int i) {
        String[] split = str.split(" ");
        for (int j= 0;j<i;j++){
            String s = split[0];
            for (int k = 0;k<split.length-1;k++) {
                split[k] = split[k+1];
            }
            split[split.length-1] = s;
        }
        System.out.println(Arrays.toString(split));
    }
}
