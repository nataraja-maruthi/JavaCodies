package com.nats.numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by nataraja.maruthi on 1/26/18.
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] input={1,1,1,1,1,3,4,5,5,6,6,7,8};
        ArrayList<Integer> output=removeDuplicates(input);
        for(Integer element:output)
        {
            System.out.println(element);
        }
    }

    private static ArrayList<Integer> removeDuplicates(int[] input) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < input.length;i++) {
            set.add(input[i]);
        }

        return new ArrayList(set);
    }
}
