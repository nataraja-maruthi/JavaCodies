package com.nats.java8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nataraja.maruthi on 1/5/18.
 */
public class MyHashMap<K,V> {


    public static void main(String[] args) {
        MyHashMap<String,String> map = new MyHashMap<>();
        map.put("nats","raj");
        map.put("nats","raj1");
        map.put("nats1","raj2");
        System.out.println(map.get("nats"));
        System.out.println(map.get("nats1"));
    }




    static int capacity = 10;
    List<Node<K,V>> mapList = new ArrayList<>();

    public MyHashMap() {
        for (int i=0;i<capacity;i++) {
            mapList.add(null);
        }
    }

    public int getIndex(K key) {
        int hashCode = key.hashCode();
        return hashCode%capacity;
    }

    public void put(K key, V value) {
        int index = getIndex(key);
        put(index,key,value);

    }

    public V get(K key) {
        int index = getIndex(key);
       return get(index,key);

    }

    public V get(int index,K key) {
        Node<K, V> kvNode = mapList.get(index);
        if (null == kvNode) {
            return null;
        } else {
            Node<K,V> curkvNode = kvNode;
            while (curkvNode != null) {
                if (curkvNode.key.hashCode()==key.hashCode()) {
                    return curkvNode.value;
                } else {
                    curkvNode = curkvNode.next;
                }
            }
        }
        return null;
    }

    private void put(int index, K key, V value) {
        Node<K, V> kvNode = mapList.get(index);
        if (kvNode==null) {
            kvNode = new Node<K, V>(key,value);
            mapList.set(index,kvNode);
            return;
        } else {
            Node<K, V> curKvNode = kvNode;
            Node<K,V> prevNode = null;
            while (curKvNode !=null) {
                if (key.hashCode()==kvNode.key.hashCode()) {
                    curKvNode.value = value;
                    return;
                } else {
                    prevNode = curKvNode;
                    curKvNode = curKvNode.next;
                }
            }
            prevNode.next = new Node<K, V>(key,value);
            return;
        }

    }


}

class Node<K,V> {
   K key;
   V value;
   Node<K,V> next;

    public Node(K key, V value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
    public Node() {
        this.key = null;
        this.value = null;
        this.next = null;
    }
}
