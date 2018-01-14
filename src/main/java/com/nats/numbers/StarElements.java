package com.nats.numbers;

/**
 * Created by nataraja.maruthi on 1/13/18.
 */
public class StarElements {
    public static void main(String[] args) {
        int [] array = {8,6,5};
        int low = 0;
        int high = array.length-1;
        for (int i = 0;i<array.length;i++) {
            if (isStar(array,i)) {
                System.out.println(array[i]);
            }
            if (isSuperStar(array,i)) {
                System.out.println(array[i]);
            }
        }
    }

    private static boolean isSuperStar(int[] array, int i) {
        int low = 0;
        int high = array.length-1;
        int target = array[i];
        int m = i, n = i+1;
        while (m>=low || n<=high) {
            if (m>=low && array[m]>target) {
                return false;
            }
            if (n<=high && array[n]>target) {
                return false;
            }
            m--;
            n++;
        }
        return true;
    }

    public static boolean isStar(int[] array, int i) {
        int low = 0;
        int high = array.length-1;
        int target = array[i];
        i++;
        while (i<high) {
            if (target<array[i]) {
                return false;
            }
            i++;
        }
        return true;
    }

}
