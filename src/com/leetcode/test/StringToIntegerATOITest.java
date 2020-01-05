package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.leetcode.java.StringToIntegerATOI;

class StringToIntegerATOITest {
	
	@Test
	void testSign() {
		StringToIntegerATOI atoi = new StringToIntegerATOI();
		assertEquals(1, atoi.myAtoi("+1"));
		assertEquals(0, atoi.myAtoi("    +0a32"));
		assertEquals(4500, atoi.myAtoi("     +004500"));
		//assertEquals(, atoi.myAtoi("  -0012a42"));
		assertEquals(-42, atoi.myAtoi("   -42"));
		assertEquals(-4193, atoi.myAtoi("-4193 with words"));
		assertEquals(0, atoi.myAtoi("-"));
		assertEquals(0, atoi.myAtoi("+"));
		assertEquals(0, atoi.myAtoi("+-"));
		assertEquals(0, atoi.myAtoi("-+"));
	}
	
	@Test
	void testWhiteSpaces() {
		StringToIntegerATOI atoi = new StringToIntegerATOI();
		assertEquals(0, atoi.myAtoi(" "));
	}
	
	@Test
	void testSignless() {
		StringToIntegerATOI atoi = new StringToIntegerATOI();
		assertEquals(3, atoi.myAtoi("3.14159"));
		assertEquals(0, atoi.myAtoi("words and 987"));
		assertEquals(42, atoi.myAtoi("42"));
	}

	@Test
	void testMinMax() {
		StringToIntegerATOI atoi = new StringToIntegerATOI();
		assertEquals(-2147483648, atoi.myAtoi("-91283472332"));
		assertEquals(2147483646, atoi.myAtoi("2147483646"));
		assertEquals(-2147483647, atoi.myAtoi("-2147483647"));
		assertEquals(2147483647, atoi.myAtoi("2147483648"));	
	}
}
