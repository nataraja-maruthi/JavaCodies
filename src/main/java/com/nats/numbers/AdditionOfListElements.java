package com.nats.numbers;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8

 * @author nataraja.maruthi
 *
 */

class ListNode {
	ListNode nextNode;
	int val;
	
	public ListNode(int val) {
		this.val = val;
	}
	
	public void setNextNode(ListNode root, ListNode next) {
		root.nextNode=next;
	}
	
	public ListNode getNextNode(ListNode node) {
		return node.nextNode;
	}
	
	public int getValue(ListNode node) {
		return node.val;
	}
	
	public static void printValues(ListNode node) {
		while (node!=null) {
			System.out.print(node.val);
			System.out.print("-->");
			node = node.nextNode;
		}
		System.out.println();
	}
	
	public static ListNode sumNodeValues(ListNode node1, ListNode node2) {
		int rem = 0;
		ListNode solnNode = null;
		ListNode currentNode = null;
		while (node1 != null) {
			int sum = node1.val+node2.val+rem;
		    rem = sum/10;
			sum = sum %10;
			if (null == solnNode) {
				solnNode = new ListNode(sum);
				currentNode = solnNode;
			} else {
				currentNode.nextNode = new ListNode(sum);;
				currentNode = currentNode.nextNode;
			}
			node1 = node1.nextNode;
			node2 = node2.nextNode;
		}
		return solnNode;
		
	}
}


public class AdditionOfListElements {
	
	public static void main(String[] args) {
		ListNode root1 = new ListNode(2);
		ListNode sub11 = new ListNode(4);
		ListNode sub12 = new ListNode(3);
		
		ListNode root2 = new ListNode(5);
		ListNode sub21 = new ListNode(6);
		ListNode sub22 = new ListNode(4);
		root1.nextNode =  sub11;
		sub11.nextNode = sub12;
		sub12.nextNode = null;
		
		root2.nextNode =  sub21;
		sub21.nextNode = sub22;
		sub22.nextNode = null;
		ListNode.printValues(addTwoNumbers(root1, root2));
	}
	
	public static ListNode addTwoNumbers(ListNode root1,ListNode root2) {
		
		return ListNode.sumNodeValues(root1, root2); 
		
	}

}
