package com.nats.search;

/**
 * Created by nataraja.maruthi on 1/7/18.
 */
public class SearchRotatedArray {
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 8, 9, 1, 2, 3};
        int n = arr.length;
        int key = 6;
        int i = search(arr, 0, n-1, key);
        System.out.println("found index is " +i);
    }


    private static int search(int[] arr, int low, int high, int key) {
        if (low>high) {
            return -1;
        }
        int mid =(low+high)/2;
        if (key == arr[mid]) {
            return mid;
        }
        if (arr[low]<=arr[mid]) {
            if (key>=arr[low] && key<arr[mid]) {
                return search(arr,low,mid-1,key);
            } else {
                return search(arr,mid+1,high,key);
            }
        }
        else if (key>arr[mid] && key<=arr[high]) {
            return search(arr,mid+1,high,key);
        } else {
            return search(arr,low,mid-1,key);
        }

    }
}
