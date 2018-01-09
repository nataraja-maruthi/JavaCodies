package com.nats.Arrays;

/**
 * Created by nataraja.maruthi on 1/7/18.
 */
public class SecondHighest {
    public static void main(String[] args) {
        int array[] = {1,2,4,6,3,7,4};
        int high = array[0];
        int shigh = array[0];
        for (int i = 1;i<array.length;i++) {
            if (array[i]>high) {
                shigh = high;
                high = array[i];
                continue;
            }
            if (array[i]>shigh ) {
                shigh = array[i];
            }
        }
        System.out.println(shigh);
    }
}
