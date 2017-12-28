package com.nats.strings;

public class LongestPalindromeString {
	
	public static void main(String[] args) {
		System.out.println(new LongestPalindromeString().longestPalindrome("1221"));
	}

	private String longestPalindrome(String string) {
		String longest = string.substring(0, 1);
		for (int i = 0; i < string.length()-1; i++) {
			
			if (longest.length()<intermediate(string,i,i).length()) {
				longest = intermediate(string,i,i);
			}
			if (longest.length()<intermediate(string,i,i+1).length()) {
				longest = intermediate(string,i,i+1);
			}
		}		
		return longest;
	}

	private String intermediate(String string, int i, int i2) {
		while (i>=0 && i2<string.length() && string.charAt(i)==string.charAt(i2)) 
		{
				i--;
				i2++;
		}
		return string.substring(i+1, i2);
	}
	 
	 
	 
	 

}
