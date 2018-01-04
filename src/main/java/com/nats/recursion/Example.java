package com.nats.recursion;

public class Example {
	
	public static void main(String[] args) {
		System.out.println(calculate(0));
//		int count = 0;
//		System.out.println(count++);
//		System.out.println(count);
	}
	
	public static int calculate(int count) {
		if (count < 10) {		
			return count + calculate(count+1);
		}
		return count;
	}
	

}
