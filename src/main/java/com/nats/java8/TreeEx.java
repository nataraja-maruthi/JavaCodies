package com.nats.java8;

import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Created by nataraja.maruthi on 1/8/18.
 */
public class TreeEx {
    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap();
        map.put("Nats","Raj");
        System.out.println(map.get("Nats"));

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.forEach(System.out::println);
    }
}
