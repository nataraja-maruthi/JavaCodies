package com.nats.sort;

/**
 * Created by nataraja.maruthi on 1/4/18.
 */
public class Sort012 {
    public static void main(String[] args) {
        int[] numbers = {1,2,1,2,0,2,0,1,0};
        int low = 0;
        int high = numbers.length-1;
        int mid = 0;
        while (mid<=high) {
            switch (numbers[mid]) {
                case 0:
                    int temp = numbers[low];
                    numbers[low] = numbers[mid];
                    numbers[mid] = temp;
                    low++;
                    mid++;
                 break;
                case 1:
                  mid ++;
                 break;
                case 2:
                    int temp1 = numbers[high];
                    numbers[high] = numbers[mid];
                    numbers[mid] = temp1;
                    high--;
            }
        }
        for (int num:numbers) {
            System.out.println(num);
        }

    }

}
