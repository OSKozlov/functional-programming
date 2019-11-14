package com.leetcode.java;

public class AddTwoNumbers {
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode fake = new ListNode(0);
		ListNode p = fake;
		
		ListNode p1 = l1;
		ListNode p2 = l2;
		
		int carry = 0;
		while(p1 != null || p2 != null) {
			int sum = carry;
			if (p1 != null) {
				sum += p1.val;
				p1 = p1.next;
			}
			
			if (p2 != null) {
				sum += p2.val;
				p2 = p2.next;
			}
			
			if (sum > 9) {
				carry = 1;
				sum = sum-10;
			} else {
				carry = 0;
			}
			
			ListNode l = new ListNode(sum);
			p.next = l;
			p = p.next;
		}
		
		if (carry > 0) {
			ListNode l = new ListNode(carry);
			p.next = l;
		}
		return fake.next;
	}

	/**
	 * Definition for singly-linked list. public class ListNode { int val; ListNode
	 * next; ListNode(int x) { val = x; } }
	 */
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
	
	public static void main(String[] args) {
		AddTwoNumbers twoNumbers = new AddTwoNumbers();
		int[] x1 = new int[]{2,4,3};
		int[] x2 = new int[]{5,6,4};
		ListNode result = null;
		for(int i=0; i<x1.length; i++) {
			result = twoNumbers.new ListNode(0);
			ListNode node1 = twoNumbers.new ListNode(x1[i]);
			ListNode node2 = twoNumbers.new ListNode(x2[i]);
			result = twoNumbers.addTwoNumbers(node1, node2);
			System.out.println("### res = " + result.val);
		}
		
	}

}
