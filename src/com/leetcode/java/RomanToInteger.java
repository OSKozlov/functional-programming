package com.leetcode.java;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author dev
 * 
 * Symbol       Value
	I             1
	V             5
	X             10
	L             50
	C             100
	D             500
	M             1000
 */
public class RomanToInteger {
	
	private Map<Character, Integer> romanDigit = new HashMap<>();
	
	{
		romanDigit.put('I', 1);
		romanDigit.put('V', 5);
		romanDigit.put('X', 10);
		romanDigit.put('L', 50);
		romanDigit.put('C', 100);
		romanDigit.put('D', 500);
		romanDigit.put('M', 1000);
	}

	public int romanToInt(String rDig) {
		char[] chr = rDig.toCharArray();
		
		int intDig = 0;
		int i = 0;
		int length = chr.length;
		while(i < length) {
			
			// I can be placed before V (5) and X (10) to make 4 and 9. 
			if ((i+1) < length && (chr[i] == 'I' && (chr[i+1] == 'V' || chr[i+1] == 'X'))) {
				intDig = intDig + (romanDigit.get(chr[i+1])-1);
				i=i+2;
				continue;
			}
			// X can be placed before L (50) and C (100) to make 40 and 90. 
			if ((i+1) < length && (chr[i] == 'X' && (chr[i+1] == 'L' || chr[i+1] == 'C'))) {
				intDig = intDig + (romanDigit.get(chr[i+1])-10);
				i=i+2;
				continue;
			}
			// C can be placed before D (500) and M (1000) to make 400 and 900.
			if ((i+1) < length && (chr[i] == 'C' && (chr[i+1] == 'D' || chr[i+1] == 'M'))) {
				intDig = intDig + (romanDigit.get(chr[i+1])-100);
				i=i+2;
				continue;
			}
			
			// if nothing found
			intDig = intDig + romanDigit.get(chr[i]);
			i++;
		}
		return intDig;
    }
	
	public static void main(String[] args) {
		RomanToInteger rToInt = new RomanToInteger();
		int result = rToInt.romanToInt("MCMXCIV");
		System.out.println("### Result = " + result);
	}
}
