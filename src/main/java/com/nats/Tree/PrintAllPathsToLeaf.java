package com.nats.Tree;

/**
 * Created by nataraja.maruthi on 1/14/18.
 */
public class PrintAllPathsToLeaf {
    static class  Node {
        Node left;
        Node right;
        int data;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        Node node1 = new Node(20);
        Node node2 = new Node(30);
        Node node3 = new Node(40);
        Node node4 = new Node(50);
        Node node5 = new Node(60);
        Node node6 = new Node(70);
        Node node7 = new Node(80);
        root.left = node1;
        root.right  = node2;
        node2.right = node3;
        node3.right = node4;
        node4.right = node5;
        node1.left = node6;
        node6.left = node7;
        printAllPathsToLeaf(root,new int[100],0);

    }

    private static void printAllPathsToLeaf(Node root, int[] array, int len) {
        if (null==root) {
            return ;
        }
        array[len] = root.data;
        len++;
        if (root.left==null && root.right==null) {
            for (int i = 0;i<len;i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
            return ;
        }
        printAllPathsToLeaf(root.left,array,len);
        printAllPathsToLeaf(root.right,array,len);


    }
}
