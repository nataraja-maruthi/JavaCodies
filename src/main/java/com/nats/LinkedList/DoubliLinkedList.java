package com.nats.LinkedList;

/**
 * Created by nataraja.maruthi on 1/13/18.
 */
public class DoubliLinkedList {
    Node head;
    Node tail;
    class Node
    {
        int data;
        Node next;
        Node prev;
        Node(int d) {data = d; next = null; prev = null; }
    }

    public static void main(String[] args) {
        DoubliLinkedList doublell = new DoubliLinkedList();
        doublell.push(10);
        doublell.push(20);
        doublell.push(30);
        doublell.push(40);
        doublell.push(50);
        doublell.traverse();
        doublell.traverseReverse();
    }

    public void push(int data) {
        if (head == null) {
            head = new Node(data);
            tail = head;
            return;
        }
        else {
            Node newNode = new Node(data);
            tail.next = newNode;
            newNode.next = null;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void traverse() {
        if (head == null) {
            return ;
        }
        Node temp = head;
        while (temp !=null) {
            System.out.print(temp.data);
            System.out.print("->");
            temp = temp.next;
        }
        System.out.println();
    }

    public void traverseReverse() {
        if (head == null) {
            return ;
        }
        Node temp = tail;
        while (temp!=null) {
            System.out.print(temp.data);
            System.out.print("->");
            temp = temp.prev;
        }
        System.out.println();
    }
}
