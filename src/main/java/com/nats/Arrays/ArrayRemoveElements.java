package com.nats.Arrays;

/**
 * Created by nataraja.maruthi on 1/6/18.
 */
public class ArrayRemoveElements {
    public static void main(String[] args) {
        int array [] = {1,2,3,4,5};
        array = new ArrayRemoveElements().remove(array, 2);
        for (int i = 0;i<array.length;i++) {
            System.out.println(array[i]);
        }
    }

    public int[] remove(int [] array, int index) {
        int requiredCopy = array.length - index-1;
        int [] copy = new int[array.length-1];
        System.arraycopy(array,0,copy,0,array.length-1);
        System.arraycopy(array,index+1,copy,index,requiredCopy);
        return copy;
    }
}
