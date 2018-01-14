package com.nats.numbers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by nataraja.maruthi on 1/13/18.
 */
public class CheckContigousNumbers {
    public static void main(String[] args) {
        int arr[] = { -10,-8,-6,-4,-2,0,2,3};
        int n = arr.length;
        solution1(arr,n);
        solution2(arr,n);


    }

    public static void solution2 (int arr [],int n) {
        HashSet<Integer> us = new HashSet<Integer>();

        for (int i = 0; i < n; i++)
            us.add(arr[i]);
        int count = 1;
        int currentElement = arr[0]-2;
        while (us.contains(currentElement)) {
            count++;
            currentElement-=2;
        }
         currentElement = arr[0]+2;
        while (us.contains(currentElement)) {
            count++;
            currentElement+=2;
        }
        if (count==us.size()) {
            System.out.println(true);
            return;
        }
        System.out.println(false);
    }

    public static void solution1(int arr [],int n) {
        Set<Integer> set = new HashSet<>();

        Arrays.sort(arr);
        int diff = 0;
        for (int i = 0;i<n-1;i++) {
            if (arr[i]!=arr[i+1]) {
                diff = arr[i+1]-arr[i];
                break;
            }
        }
        for (int i = 0;i<n-1;i++) {
            if (arr[i]!=arr[i+1] && arr[i+1]-arr[i]!=diff) {
                System.out.println(false);
                return;
            }
        }

        System.out.println(true);
    }


}
