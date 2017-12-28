package com.nats.strings;

public class LongestPrefix {
	
    public static void main(String[] args) {
		String [] str = {"LeetCode","LeetTea","Leet"};
		getLongestPrefix(str);
	}
    
    private static void getLongestPrefix(String[] str) {
    	String small ="";
    	int size = Integer.MAX_VALUE;
    	for (String string : str) {
			if (string.length()<size) {
				size = string.length();
				small = string;
			}
		}    	
    	int i=0,j=0;
    	String search = "" ;
    	while (i<size && j<size) {
			if (containsSubString(str, search.concat(String.valueOf(small.charAt(i))))) {
				search = search.concat(String.valueOf(small.charAt(i++)));				
			} else {
				i++;
				search = search.substring(j);
			}
		}
    	System.out.println(search);
    }
    
    private static boolean containsSubString(String [] list, String search) {
    	boolean flag = true;
    	for (String string : list) {
			if (!string.contains(search)) {
				flag = false; 
			}
		}
    	return flag;
    }

}
