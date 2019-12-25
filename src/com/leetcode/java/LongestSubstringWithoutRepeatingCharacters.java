package com.leetcode.java;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
	
	public static void main(String[] args) {
		String str = "pwwkew";//"abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLM";//"pwwkew";
		long startTime = System.currentTimeMillis();
		int result = lengthOfLongestSubstring(str);
		long stopTime = System.currentTimeMillis();
	    long elapsedTime = stopTime - startTime;
	    System.out.println(elapsedTime);
		System.err.println("### result = " + result);
	}

	public static int lengthOfLongestSubstring(String s) {
		if (s==null || s.length()==0) return 0;
		int maxLen = 1;
		for(int i=0; i<s.length(); i++) {
			for (int j=i+1; j<=s.length(); j++) {
				boolean isDuplicate = isDuplicate(s, i, j);
				
				if (!isDuplicate) {
					maxLen = Math.max(maxLen, j-i);
				}
		   }
		}
		return maxLen;
    }
	
	private static boolean isDuplicate(String s, int start, int end) {
		Set<Character> set = new HashSet<>();
		for (int i = start; i < end; i++) {
		  char ch = s.charAt(i);
		  if (set.contains(ch)) return true;
		  	set.add(ch);
		}
		return false;
	}

}
