package com.leetcode.java;

import java.util.Stack;

class MinStack {

	Stack<Integer> stack = new Stack();
	Stack<Integer> minVals = new Stack();
	
    public MinStack() {
        
    }
    
    public void push(int x) {
    	if (minVals.isEmpty() || x <= minVals.peek()) {
    		minVals.push(x);
    	}
    	stack.push(x);
    }
    
    public void pop() {
        if (stack.peek().equals(minVals.peek())) {
        	minVals.pop();
        }
        stack.pop();
    }
    
    public int top() {
		return stack.peek();
        
    }
    
    public int getMin() {
		return minVals.peek();
        
    }
    
    public static void main(String[] args) {
    	MinStack minStack = new MinStack();
    	minStack.push(-2);
    	minStack.push(0);
    	minStack.push(-3);
    	minStack.getMin(); // return -3
    	System.err.println("### minStack.getMin() = " + minStack.getMin());
    	minStack.pop();
    	minStack.top();    // return 0
    	System.err.println("### minStack.top() = " + minStack.top());
    	minStack.getMin(); // return -2
    	System.err.println("### minStack.getMin() = " + minStack.getMin());
    }
}