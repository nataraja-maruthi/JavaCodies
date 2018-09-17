package com.nats.numbers;

import java.util.Arrays;

public class ArraysExamples {

	public static void main(String[] args) {
		char c[] = {'c','d'};
//		char[] copyOf = Arrays.copyOf(c, 1);
		System.out.println(Arrays.asList(c).size());
//		System.out.println(c);
//		System.out.println(copyOf);
		
		String str  = "01";
		//48*31+49
		//0 ASCII 48 * 31 Pow(n-1) + 1's ASCII 49 * 31 pow (n-1)
		System.out.println(str.hashCode());
		
	}
}
