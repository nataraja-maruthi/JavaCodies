package com.nats.LinkedList;

/**
 * Created by nataraja.maruthi on 1/13/18.
 */
public class CircularLinkedList {
    Node head;
    Node tail;

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        list.traverse();

    }

    /* Linked list Node*/
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }

    public void push(int data) {
        if (head==null) {
            head = new Node(data);
            tail = head;
        } else {
            Node node = new Node(data);
            tail.next = node;
            tail = node;
            tail.next = head;
        }
    }

    public void traverse() {
        if (head==null) {
            return;
        }
        Node temp = head;
        while (temp.next!=head) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
}
