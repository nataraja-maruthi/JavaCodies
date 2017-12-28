package com.nats.strings;

public class StringToInteger {

	public static void main(String[] args) {
		System.out.println(new StringToInteger().atoi("1234"));
		char c = '4';
		System.out.println((c-'0')*10);
		
		
	}
	
	 public int atoi(String str) {
	        // Start typing your Java solution below
	        // DO NOT write main() function
	        // string start with -
	        // string is overflow the Integer.MAX_VALUE
	        if(str.length() == 0) return 0;
	        
	        int right = str.length() - 1;
	        int res = 0;
	        int digit = 1;
	        
	        if(right == 0){
	            return str.charAt(right) - '0';
	        }
	        
	        while(right >= 0){
	            char c = str.charAt(right);
	            //System.out.println(res);
	            if(c == '+') {
	                right--;
	            } else if (c == '-'){
	                res *= -1;
	                right--;
	            } else if (('0' <= c) && (c <= '9')) {
	                //System.out.println(c);
	                res += ((c - '0') * digit);
	                digit *= 10;
	                right--;
	            } else {
	                right--;
	            }
	        }
	        
	        return res;
	    }
}
