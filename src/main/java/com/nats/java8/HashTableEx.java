package com.nats.java8;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/**
 * Created by nataraja.maruthi on 1/8/18.
 */
public class HashTableEx {

    public static void main(String[] args) {
        Hashtable<String,String> table = new Hashtable<>();
        table.put("Nats","Raja");
//        table.put(null,null);
        System.out.println(table.get("Nats"));
        System.out.println(table.getOrDefault("D","hey"));


        HashMap<String,String> map = new HashMap<>();
        map.put("Nats","Raja");
        map.put(null,"Dummy");
        System.out.println(map.get(null));
    }
}
