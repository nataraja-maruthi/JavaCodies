package com.nats.Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by nataraja.maruthi on 1/14/18.
 */
public class TreeHeight {
    public int treeHeight(Node root){
        if(root==null)return 0;
        return (1+ Math.max(treeHeight(root.left),treeHeight(root.right)));
    }

    public int treeHeightWithoutRec(Node root) {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        int count = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size>0) {
                Node poll = queue.poll();
                if (poll.left!=null) {
                    queue.add(poll.left);
                }
                if (poll.right!=null) {
                    queue.add(poll.right);
                }
                size--;
            }
            count++;
        }
        return count;
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        Node root = new Node(5);
        root.left = new Node(10);
        root.right = new Node(15);
        root.left.left = new Node(20);
        root.left.right = new Node(25);
        root.left.left.left =new Node(30);
        root.left.right.left = new Node(35);
        root.left.right.left.left = new Node(40);
        root.left.right.left.left.right = new Node(45);
        root.left.right.left.left.right.left = new Node(50);
        TreeHeight i  = new TreeHeight();
        System.out.println(i.treeHeight(root));
        System.out.println(i.treeHeightWithoutRec(root));
    }
}
class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
