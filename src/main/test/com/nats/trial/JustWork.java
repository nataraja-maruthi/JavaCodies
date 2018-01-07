package com.nats.trial;

/**
 * Created by nataraja.maruthi on 12/29/17.
 */
public class JustWork {
    public static void main(String[] args) {

        char array[] = {'1','2','3','4'};
//        System.out.println(array.length);
        char copy [] =  new char[5];
        System.arraycopy(array,3,copy,1,1);
        for (int i = 0;i<copy.length;i++) {
            System.out.println(copy[i]);
        }
    }
}
