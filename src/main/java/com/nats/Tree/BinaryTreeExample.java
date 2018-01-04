package com.nats.Tree;

/**
 * Created by nataraja.maruthi on 1/4/18.
 */
public class BinaryTreeExample {

}

class BinaryTree {

    BinaryTree lNode, rNode;
    int data;

    public BinaryTree(int data) {
        this.data = data;
        this.lNode = null;
        this.rNode = null;
    }

    public BinaryTree() {
        this.data = 0;
        this.lNode = null;
        this.rNode = null;
    }

    public void setLeft(BinaryTree lnode) {
        this.lNode = lnode;
    }

    public BinaryTree getLeftNode() {
        return lNode;
    }

    public void setRight(BinaryTree rNode) {
        this.rNode = rNode;
    }

    public BinaryTree getRightNode() {
        return rNode;
    }

    public void setData(int d) {
        this.data = d;
    }

    public int getData(){
        return data;
    }

}
