package com.nats.Tree;

/**
 * Created by nataraja.maruthi on 1/14/18.
 */
public class LevelOfNode {
    public static class TreeNode
    {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data)
        {
            this.data=data;
        }
    }

    public static void main(String[] args)
    {
        // Creating a binary tree
        TreeNode rootNode=createBinaryTree();
        System.out.println("Node data: 70,Level :"+getLevelOfNode(rootNode, 70, 1));
        System.out.println("Node data: 100,Level :"+getLevelOfNode(rootNode, 100, 1));
        System.out.println("Node data: 60,Level :"+getLevelOfNode(rootNode, 60, 1));
        System.out.println("Node data: 40,Level :"+getLevelOfNode(rootNode, 40, 1));
    }

    private static int getLevelOfNode(TreeNode rootNode, int key, int level) {
        if (rootNode==null) {
            return 0;
        }
        if (rootNode.data==key) {
            return level;
        }
        int levelOfNode = getLevelOfNode(rootNode.left, key, level + 1);
        if (levelOfNode!=0) {
            return levelOfNode;
        }
        levelOfNode = getLevelOfNode(rootNode.right,key,level+1);
        return levelOfNode;
    }

    public static TreeNode createBinaryTree()
    {

        TreeNode rootNode =new TreeNode(40);
        TreeNode node20=new TreeNode(20);
        TreeNode node10=new TreeNode(10);
        TreeNode node30=new TreeNode(30);
        TreeNode node60=new TreeNode(60);
        TreeNode node50=new TreeNode(50);
        TreeNode node70=new TreeNode(70);

        rootNode.left=node20;
        rootNode.right=node60;

        node20.left=node10;
        node20.right=node30;

        node60.left=node50;
        node60.right=node70;

        return rootNode;
    }
}
