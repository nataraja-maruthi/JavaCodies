package com.nats.sort;

/**
 * Created by nataraja.maruthi on 1/7/18.
 */
public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int array1[] = {5,4,3,2,1};
        int array2[] = {9,8,7,6};
        int [] resultArray = new int[array1.length+array2.length];
        int i=array1.length-1,j=array2.length-1;
        int k = 0;
        while (i>=0 && j>=0) {
            if (array1[i] <array2[j]) {
                resultArray[k++] = array1[i];
                i--;
            } else {
                resultArray[k++] = array2[j];
                j--;
            }
        }
        if (i!=0) {
            while (i>=0) {
                resultArray[k++] = array1[i];
                i--;
            }
        }
        if (j!=0) {
            while (j>=0) {
                resultArray[k++] = array2[j];
                j--;
            }
        }

        for (int m = 0;m<resultArray.length;m++) {
            System.out.println(resultArray[m]);
        }
    }
}
