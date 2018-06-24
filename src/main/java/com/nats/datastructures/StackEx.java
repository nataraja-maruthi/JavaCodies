package com.nats.datastructures;

public class StackEx {
	
	public static void main(String[] args) {		
		Stack stack = new Stack(2);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.display();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.display();
		
	}	
}
class Stack {
	int val;
	int top = -1;
	int array [];
	int size ;
	int len = 0;
	public Stack(int size) {
		this.size = size;
		array = new int [size];
	}
	
	public void push (int value) {
		if (top+1>=size) {
			System.out.println("Overflow");
			return;
		}
		array[++top] = value;
		len++;
	}
	
	public int pop() {
		if (top<0) {
			System.out.println("underflow");
			return -1;
		} else {
			int temp = array[top--];
			len--;
			return temp ;
		}
		
	}
	public void display() {
		for (int i = 0; i <=top; i++) {
			System.out.println(array[i]);
		}
	}
}
