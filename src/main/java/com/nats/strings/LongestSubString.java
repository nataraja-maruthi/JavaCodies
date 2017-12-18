package com.nats.strings;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author nataraja.maruthi
 * 
 * Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 *
 */
public class LongestSubString {
	
	public static void main(String[] args) {
		System.out.println(new LongestSubString().lengthOfLongestSubstring("dvdf"));
	}
	public int lengthOfLongestSubstring(String s) {
		int length = s.length();
		int result = 0;
		for (int i = 0; i < length; i++) {
			for (int j = i+1; j < length; j++) {
				if (allUnique(s, i, j)) {
					result = Math.max(result, j-i);
				}
			}
			
		}
		return result;
    } 
	
	public boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet();
        for (int i = start; i < end; i++) {
            Character ch = s.charAt(i);
            if (set.contains(ch)) return false;
            set.add(ch);
        }
        return true;
    }
}
