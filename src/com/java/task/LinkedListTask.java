package com.java.task;

//Task: How to find the middle element in LinkedList in one pass?
public class LinkedListTask {
	
	public static void main(String[] args) {
		findMiddleElementOfLinkedListInOnePass();
	}
	
	/*
	 * Task: How to find the middle element in LinkedList in one pass?
	 */
	private static void findMiddleElementOfLinkedListInOnePass() {
		LinkedList linkedList = new LinkedList();
		LinkedList.Node head = linkedList.head();
		linkedList.add(new LinkedList.Node("1"));
		linkedList.add(new LinkedList.Node("2"));
		linkedList.add(new LinkedList.Node("3"));
		linkedList.add(new LinkedList.Node("4"));
		linkedList.add(new LinkedList.Node("5"));
		linkedList.add(new LinkedList.Node("6"));
		linkedList.add(new LinkedList.Node("7"));
		linkedList.add(new LinkedList.Node("8"));
		linkedList.add(new LinkedList.Node("9"));
		linkedList.add(new LinkedList.Node("10"));
		LinkedList.Node current = head;
		int length = 0;
		LinkedList.Node middle = head;
		while (current.next() != null) {
			length++;
			if (length % 2 == 0) {
				middle = middle.next();
			}
			current = current.next();
		}
		if (length % 2 == 1) {
			middle = middle.next();
		}
		System.out.println("length of LinkedList: " + length);
		System.out.println("middle element of LinkedList : " + middle);
	}

}
