package com.nats.numbers;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by nataraja.maruthi on 1/13/18.
 */
public class ListPaitOfPositiveAndNegativeNumbers {
    public static void main(String[] args) {
        int [] arr = {4,8,9,-4,1,-1,-8,-9};
//        solution1(arr);
        solution2(arr);
    }

    private static void solution2(int[] arr) {
        Arrays.sort(arr);
        int i =0,j=arr.length-1;
        while (i<j)
            if (arr[i]+arr[j]==0) {
                System.out.println(arr[i] +" "+arr[j]);
                i++;j--;
            } else if (arr[i]+arr[j]>0) {
                j--;
            } else{
                i++;
            }
    }

    private static void solution1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (i!=j&&arr[i]+arr[j]==0) {
                    System.out.println(arr[i] +" "+arr[j]);
                }
            }
        }
    }
}
