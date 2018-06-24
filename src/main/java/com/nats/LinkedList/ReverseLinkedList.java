package com.nats.LinkedList;

/**
 * Created by nataraja.maruthi on 1/26/18.
 */
public class ReverseLinkedList {
    Node head = null;
    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.displayList();
        list.reverseList();
        list.displayList();


    }

    public void displayList() {
        if (head == null) {
            System.out.println("No Element to display");
        }
        Node current = head;
        while (current!=null) {
            System.out.print(current.data);
            System.out.print("->");
            current = current.next;
        }
        System.out.println("");
    }

    public void reverseList() {
        Node prev = null;
        Node cur = head;
        if (null==head) {
            System.out.println("no data");
        } else {
            while (cur!=null) {
                Node temp = cur.next;
                cur.next = prev;
                prev = cur;
                cur = temp;
            }
        }
        head = prev;
    }

    public void insert(int data) {
        if (null==head) {
          head = new Node(data);
        } else {
            Node current = head;
            while (current.next!=null) {
                current = current.next;
            }
            current.next = new Node(data);
        }
    }





    class Node {
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }
}

