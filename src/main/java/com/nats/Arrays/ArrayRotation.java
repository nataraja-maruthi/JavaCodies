package com.nats.Arrays;

/**
 * Created by nataraja.maruthi on 1/6/18.
 */
public class ArrayRotation {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7};
        new ArrayRotation().printArray(array);
        new ArrayRotation().rotateLeft(array,3);
        new ArrayRotation().printArray(array);
        new ArrayRotation().rotateRight(array,3);
        new ArrayRotation().printArray(array);
        new ArrayRotation().rorateLeftUsingSplit(array,3);
        new ArrayRotation().printArray(array);

    }

    public void rotateLeft(int[] array, int n) {
        int counter=0;
        while (counter<n) {
                int temp = array[0];
                System.arraycopy(array,1,array,0,array.length-1);
                array[array.length-1] = temp;
            counter++;
        }
    }

    public void rotateRight(int[] array, int n) {
        int counter = 0;
        while (counter < n) {
            int temp = array[array.length - 1];
            System.arraycopy(array, 0, array, 1, array.length - 1);
            array[0] = temp;
            counter++;
        }
    }
    public void printArray(int [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

    public void rorateRightUsingSplit(int[] array, int order) {
        int index = array.length-order;
        reverse(array,index,array.length-1);
        reverse(array,0,index-1);
        reverse(array,0,array.length-1);
    }

    public void rorateLeftUsingSplit(int[] array, int order) {

        reverse(array,0,order-1);
        reverse(array,order,array.length-1);
        reverse(array,0,array.length-1);
    }

    public void reverse(int [] array, int low, int high) {
        while (low<high) {
            int temp = array[low];
            array[low] = array[high];
            array[high] = temp;
            low ++;
            high--;

        }
    }
}
