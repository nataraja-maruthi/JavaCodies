package com.nats.recursion;

public class PowOfNumber {
	
	public static void main(String[] args) {
		System.out.println(new PowOfNumber().pow(4, 3));
	}
	
	
	public int pow(int num1, int num2) {
		if (num2==0) {
			return 1;
		} else {
			return num1*pow(num1, num2-1);
		}
	}
}
