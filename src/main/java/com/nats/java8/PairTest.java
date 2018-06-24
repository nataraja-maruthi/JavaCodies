package com.nats.java8;

/**
 * Created by nataraja.maruthi on 1/26/18.
 */
public class PairTest {

    public static void main(String[] args) {
        Pair<String,String> pair = new Pair<>();
        pair.left = "Nats";
        pair.right = "Raj";
        System.out.println(pair.left);
        System.out.println(pair.right);

        Pair<Integer,Integer> pair1 = new Pair<>();
        pair1.left = 1;
        pair1.right = 2;
        System.out.println(pair1.left);
        System.out.println(pair1.right);

        Pair<Object,Object> pair2 = new Pair<>();
        pair2.left = 11+"asd";
        pair2.right = 22+"asdf";
        System.out.println(pair2.left);
        System.out.println(pair2.right);
    }

    static class Pair<T,V> {
        T left;
        V right;
    }
}
