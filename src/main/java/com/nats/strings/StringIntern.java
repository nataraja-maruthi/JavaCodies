package com.nats.strings;

public class StringIntern {
	public static void main(String[] args) {
		String s1 = "Nats";
		String s4 = "Nats";
		String s2 = new String("Nats");
		String s3 = new String("Nats");
		System.out.println(s1==s4);
		System.out.println(s1==s2);
		System.out.println(s3==s2);
		System.out.println(s1==s2.intern());
		
		
	}

}
