package com.nats.recursion;

public class Factorial {
	
	public static void main(String[] args) {
		System.out.println(new Factorial().fact(5));
	}
	
	public int fact(int n) {
		if (n==1) return 1;
		else 
			return n*fact(n-1);
	}

}
