package com.nats.recursion;

public class ReverseString {
	
	String str1 = "";
	public static void main(String[] args) {
		System.out.println(new ReverseString().rev("nats"));
	}
	public String rev(String str) {
		
		if (str.length()==1) {
			return str;
		} else {	
			return rev(str.substring(1))+str.charAt(0);
		}
	}

}
