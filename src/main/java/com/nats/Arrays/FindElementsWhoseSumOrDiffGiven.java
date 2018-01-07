package com.nats.Arrays;

/**
 * Created by nataraja.maruthi on 1/6/18.
 */
public class FindElementsWhoseSumOrDiffGiven {
    public static void main(String[] args) {
        int [] array = {20, 30, 10 , 0 , 55, 55, 2, 3, 5, 5};
        int finder = 10;
        // Sum, if needed {10,0} and {0.10}, then initialize j as 0.
        // Else initialize j=i;
        for (int i=0;i<array.length;i++) {
            for (int j = i;j<array.length;j++) {
                if (i==j) {
                    continue;
                } else if (Math.addExact(array[i],array[j])==finder) {
                    System.out.println("{"+array[i]+","+array[j]+"}");
                }
            }
        }
    }
}
