package com.nats.sort;

/**
 * Created by nataraja.maruthi on 1/9/18.
 */
public class MergeSort {
    static int [] array = {3,4,2,6,1,7,4};
    static int [] helpher = new int[array.length];
    public static void main(String[] args) {
        mergeSort(0,array.length-1);
        for (int i = 0; i< array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static void mergeSort( int low, int high) {
        if (low<high) {
            int mid = low + (high - low) / 2;
            mergeSort(low,mid);
            mergeSort(mid+1,high);
            merge(low,mid,high);
        }
        
    }

    private static void merge(int low, int mid, int high) {
        for (int i = low;i<=high;i++) {
            helpher[i] = array[i];
        }
        int i = low;
        int j = mid+1;
        int k = low;
        while (i<=mid && j<=high) {
            if (helpher[i]<=helpher[j]) {
                array[k] = helpher[i];
                i++;

            } else {
                array[k] = helpher[j];
                j++;
            }
                k++;
        }

          while (i<=mid) {
              array[k++] = helpher[i++];
          }

    }
}
