package com.nats.numbers;

/**
 * Created by nataraja.maruthi on 1/13/18.
 */
public class MaximunTipCalculator {
    public static void main(String[] args) {
        int N = 8;
        int X = 4;
        int Y = 4;
        int[] arrX = {1,4,3,2,7,5,9,6};
        int[] arrY = {1,2,3,6,5,4,9,8};
        int maxProfit = 0;
        for(int j=0;j<N;j++) {
            if(X < 0)
                maxProfit += arrY[j];
            else if (Y < 0)
                maxProfit += arrX[j];
            else if(arrX[j] > arrY[j]) {
                maxProfit += arrX[j];
                X--;
            }
            else {
                maxProfit += arrY[j];
                Y--;
            }

        }
        System.out.println(maxProfit);
    }


}
