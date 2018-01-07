package com.nats.LinkedList;

import java.util.LinkedList;

/**
 * Created by nataraja.maruthi on 1/7/18.
 */
public class MergeTwoLinkedList {
    static List root1 = null;
    static List root2 = null;
    static List root3 = null;

    public static void main(String[] args) {
        root1 = new List(10);
        addNode(root1, 20);
        addNode(root1, 30);
        addNode(root1, 40);
        addNode(root1, 50);
        addNode(root1, 60);

        root2 = new List(110);
        addNode(root2, 120);
        addNode(root2, 130);
        addNode(root2, 140);
        addNode(root2, 150);
        addNode(root2, 160);
        addNode(root2, 170);
        addNode(root2, 180);
        addNode(root2, 190);
        mergeUsingDummyList(root1, root2);


    }

    public static void mergeWithoutDummy(List list1, List list2) {


    }

    private static void mergeUsingDummyList(List list1, List list2) {
        List l1 = list1;
        List l2 = list2;
        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                root3 = addNode(root3, l1.data);
                l1 = l1.next;
            } else {
                root3 = addNode(root3, l2.data);
                l2 = l2.next;
            }
        }
        if (l1 !=null) {
            while (l1!=null) {
                addNode(root3,l1.data);
                l1 = l1.next;
            }
        }
        if (l2 !=null) {
            while (l2!=null) {
                addNode(root3,l2.data);
                l2 = l2.next;
            }
        }
        displa(root3);
    }

    public static List addNode(List root, int data) {
        if (root == null) {
            root = new List(data);
            return root;
        }
        List temp = root;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new List(data);
        return root;
    }

    public static void displa(List root) {
        if (root == null) {
            System.out.println("nothing to display");
            return;
        }
        List temp = root;
        while (temp != null) {
            System.out.print(temp.data);
            System.out.print(" ");
            temp = temp.next;
        }
        System.out.println("");

    }
}

class List {
    List next;
    int data;

    public List(int data) {
        this.data = data;
    }
}
