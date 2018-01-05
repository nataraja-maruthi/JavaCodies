package com.nats.Tree;

import java.util.Stack;

/**
 * Created by nataraja.maruthi on 1/4/18.
 */
public class BinaryTreeExample {
    BinaryTree root ;


    public BinaryTreeExample() {
        root = null;
    }

    public boolean isEmpty() {
        return root==null;
    }

    public void insert(BinaryTree node, int value) {
        if (value <= node.getData()) {
            BinaryTree leftNode = node.getLeftNode();
            if (null == leftNode) {
                node.left = new BinaryTree(value);
            } else {
                insert(leftNode, value);
            }
        } else {
            BinaryTree rightNode = node.getRightNode();
            if (null == rightNode) {
                node.right = new BinaryTree(value);
            } else {
                insert(rightNode, value);
            }
        }
    }
    public void insert(int value) {
        if (root == null) {
            root  = new BinaryTree(value);
        } else {
            boolean flag = true;
            BinaryTree currentNode = root;
            BinaryTree prevNode;
            while (flag) {
                prevNode = currentNode;
                if (value<=currentNode.getData()) {
                    currentNode = currentNode.getLeftNode();
                    if (currentNode == null) {
                        prevNode.setLeft(new BinaryTree(value));
                        flag = false;
                    }
                } else if (value>currentNode.getData()) {
                    currentNode = currentNode.getRightNode();
                    if (currentNode==null) {
                        prevNode.setRight(new BinaryTree(value));
                        flag = false;
                    }
                }
            }
        }
    }

    public boolean checkBST(BinaryTree node, int min,int max){
        if (null==node) {
            return true;
        }
        if (node.data < min || node.data > max) {
            return false;
        }

        return checkBST(node.getLeftNode(),min,node.getData()-1) ||
                checkBST(node.getRightNode(),node.getData()+1 , max);

    }
    public void inOrderTraversalWithoutRecursion(BinaryTree node) {
        Stack<BinaryTree> stack = new Stack<>();
        BinaryTree temp = node;
        while (!stack.isEmpty() || temp !=null) {
            if (temp !=null) {
                stack.push(temp);
                temp = temp.getLeftNode();
            } else {
                BinaryTree pop = stack.pop();
                System.out.println(pop.getData());
                temp = pop.getRightNode();
            }
        }
    }



    public int countNodes(BinaryTree node) {
        if (node==null) return 0;
        return 1+countNodes(node.getLeftNode())+ countNodes(node.getRightNode());
    }

    public void inOrderTraversal(BinaryTree node) {
        if (node !=null) {
            inOrderTraversal(node.getLeftNode());
            System.out.print(node.getData());
            System.out.print(" ");
            inOrderTraversal(node.getRightNode());
        }
    }

    public void preOrderTraversal(BinaryTree node) {
        if (node !=null) {
            System.out.print(node.getData());
            System.out.print(" ");
            preOrderTraversal(node.getLeftNode());
            preOrderTraversal(node.getRightNode());
        }
    }

    public void postOrderTraversal(BinaryTree node) {
        if (node !=null) {
            postOrderTraversal(node.getLeftNode());
            postOrderTraversal(node.getRightNode());
            System.out.print(node.getData());
            System.out.print(" ");
        }
    }




}

class BinaryTree {

    BinaryTree left, right;
    int data;

    public BinaryTree(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public BinaryTree() {
        this.data = 0;
        this.left = null;
        this.right = null;
    }

    public void setLeft(BinaryTree lnode) {
        this.left = lnode;
    }

    public BinaryTree getLeftNode() {
        return left;
    }

    public void setRight(BinaryTree rNode) {
        this.right = rNode;
    }

    public BinaryTree getRightNode() {
        return right;
    }

    public int getData() {
        return data;
    }

    public void setData(int d) {
        this.data = d;
    }

}
