package com.leetcode.java;

public class AddTwoNumbers {
	
	static Node head1, head2;
	
	public Node addTwoNumbers(Node first, Node second) {
		Node res = null;
		Node prev = null;
		Node temp = null;
		int carry = 0, sum;
		
		while(first != null || second != null) {
			sum = carry + (first != null ? first.data : 0) +
					(second != null ? second.data : 0);
			
			carry = (sum>=10) ? 1 : 0;
			
			sum = sum % 10;
			
			temp = new Node(sum);
			
			if (res == null) {
				res = temp;
			} else {
				prev.next = temp;
			}
			
			// Set prev for next insertion 
            prev = temp; 
            
			if (first != null) {
				first = first.next;
			}
			if (second != null) {
				second = second.next;
			}
			
		}
		
		if (carry > 0) { 
            temp.next = new Node(carry); 
        } 
		
		return res;
	}

	/**
	 * Definition for singly-linked list. public class ListNode { int val; ListNode
	 * next; ListNode(int x) { val = x; } }
	 */
	static class Node {
		int data;
		Node next;

		Node(int x) {
			data = x;
			next = null;
		}
	}
	
	static void printList(Node head) {
		while(head != null) {
			System.out.println(head.data + " ");
			head = head.next;
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
		
		addTwoNumbers.head1 = new Node(2);
		addTwoNumbers.head1.next = new Node(3);
		addTwoNumbers.head1.next.next = new Node(5);
		printList(head1);
		
		addTwoNumbers.head2 = new Node(9);
		addTwoNumbers.head2.next = new Node(4);
		addTwoNumbers.head2.next.next = new Node(2);
		printList(head2);
		
		Node result = addTwoNumbers.addTwoNumbers(head1, head2);
		printList(result);
		
	}

}
