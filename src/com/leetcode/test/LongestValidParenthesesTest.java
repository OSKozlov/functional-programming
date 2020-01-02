package com.leetcode.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.leetcode.java.LongestValidParentheses;

class LongestValidstrarenthesesTest {

	@Test
	void testLongestValidstrarentheses() {
		
        String str1 = "((()",
                str2 = ")()())()()()()",            
                str3 = "()(()))))",
                str4 = ")()())",
                str5 = "()()()",
                str6 = "",
                str7 = "((((",
                str8 = "(((()",
                str9 = "(((())(",
                str10 = "()(()",
                str11 = "()(())",
                str12 = "(()())",
                str13 = "(()()",
                str14 = "()(()";
		
        
        LongestValidParentheses longest = new LongestValidParentheses();
        assertEquals(2, longest.longestValidParentheses(str1));
        assertEquals(8, longest.longestValidParentheses(str2));
        assertEquals(6, longest.longestValidParentheses(str3));
        assertEquals(4, longest.longestValidParentheses(str4));
        assertEquals(6, longest.longestValidParentheses(str5));
        assertEquals(0, longest.longestValidParentheses(str6));
        assertEquals(0, longest.longestValidParentheses(str7));
        assertEquals(2, longest.longestValidParentheses(str8));
        assertEquals(4, longest.longestValidParentheses(str9));
        assertEquals(2, longest.longestValidParentheses(str10));
        assertEquals(6, longest.longestValidParentheses(str11));
        assertEquals(6, longest.longestValidParentheses(str12));
        assertEquals(4, longest.longestValidParentheses(str13));
        assertEquals(2, longest.longestValidParentheses(str14));
	}

}
