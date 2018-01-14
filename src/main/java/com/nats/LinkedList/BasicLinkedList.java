package com.nats.LinkedList;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by nataraja.maruthi on 1/3/18.
 */
public class BasicLinkedList<T> {
     Node<T> head = null;
     Node<T> tail = null;

    public static void main(String[] args) {
        BasicLinkedList ll = new BasicLinkedList();
        Node node = ll.addNode(10);
        Node node1 = ll.addNode(20);
        ll.printReverse(node);

//        ll.displayLinkedList();
//        ll.addAtPos(1,100);
//        ll.addAfter(20,100);
//        ll.displayLinkedList();
//        ll.removeAtPos(1);
//        ll.displayLinkedList();
//        ll.removeAfter(100);
//        ll.reverseLinkedList();
//        ll.displayLinkedList();
    }



    public boolean isLoopDetected(Node<T> head) {
        Set<Node> set = new HashSet<>();
        Node temp = head;
        while (temp!=null) {
            if (!set.add(temp)) {
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }

    public void printReverse(Node<T> head){
        if (head==null) {
            return;
        }
        printReverse(head.getNext());
        System.out.println(head.getData());

    }

    public void reverseLinkedList() {
        if (head==null) return ;
        Node<T> prev = null;
        Node<T> curr = head;
        while (curr!=null) {
            Node<T> temp = curr.getNext();
            curr.setNext(prev);
            prev = curr;
            curr = temp;
        }
        head = prev;
    }

    public void removeAtPos(int pos) {
        int position = 1;
        if (head==null) {
            System.out.println("No element to delete");
        }
        if (pos==1) {
            Node<T> node = head.getNext();
            head = node;
        }
        Node<T> temp = head;
        Node<T> prev = temp;
        while (temp !=null) {
            if (position == pos) {
                prev.setNext(temp.getNext());
                break;
            } else {
                prev = temp;
                temp = temp.getNext();
                position++;
            }
        }
        if (position != pos) {
            System.out.println("unable to delete at given position : " + pos);
        }

    }

    public void removeAfter(T value) {

        if (head==null) {
            System.out.println("No element to delete");
        }
        Node<T> temp = head;
        while (temp!=null) {
            if (temp.compareTo(value)==0 && temp.getNext() != null) {
                temp.setNext(temp.getNext().getNext());
                break;
            } else {
                temp = temp.getNext();
            }
        }
    }

    public void addAtPos(int pos, T value) {
        Node<T> newNode = new Node<T>(value);
        int position = 1;
        if (head == null) {
            head = newNode;
            return;
        }
        if (pos ==1) {
            newNode.setNext(head);
            head = newNode;
            return;
        }
        Node<T> temp = head;
        Node<T> prev = temp;
        while (temp!=null) {
            if (pos==position) {
                prev.setNext(newNode);
                newNode.setNext(temp);
                break;
            } else {
                prev = temp;
                temp = temp.getNext();
                position++;
            }
        }
        if (pos!=position) {
            System.out.println("unable to insert at given position");
        }
    }

    public void addAfter(T currentValue, T insertionValue) {
        Node<T> newNode = new Node<T>(insertionValue);
        int position = 1;
        if (head == null) {
            head = newNode;
            return;
        }
        Node<T> temp = head;
        while (temp!=null) {
            if (temp.compareTo(currentValue)==0) {
                Node<T> next = temp.getNext();
                newNode.setNext(next);
                temp.setNext(newNode);
                break;
            } else {
                temp = temp.getNext();
                position++;
            }
        }
    }


    public  Node<T> addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
        return tail;
    }

    public void printTail() {
        if (null != tail) {
            System.out.println("Tail is : " + tail.getData());
        }
    }

    public void printHead() {
        if (null != head) {
            System.out.println("Head is : "+ head.getData());
        }
    }

    public void displayLinkedList () {
        Node temp = head;
        while (temp !=null) {
            System.out.print(temp.getData());
            System.out.print("->");
            temp = temp.getNext();
        }
        System.out.println();
    }
}

class Node<T> implements Comparable<T>{
  private Node<T> next;
  private T data;

    public Node( T data) {
        this.data = data;
        this.next = null;
    }

    public T getData() {
        return (T)this.data;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public void setNext(Node<T> node) {
        this.next  = node;
    }

    @Override
    public int compareTo(T arg) {
        if (this.getData()==arg)
        return 0;
        return 1;
    }
}
