package com.test.interview.ds.stack;

public class Stack {
	
	private int stack[] = new int[5];
	private int top = 0;
	
	public void push(int data) {
		if(top == 5) {
			System.out.println("Stack is full");
		}else {
			stack[top] = data;
			top++;
		}
	}
	
	public int pop() {
		int data = 0;
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}else {
			top--;
			data = stack[top];
			stack[top] = 0;
		}
		return data;
	}
	
	public int peek() {
		int data = stack[top-1];
		return data;
	}
	
	public int size() {
		return top;
	}
	
	public Boolean isEmpty() {
		return top <= 0;
	}
	
	public void show() {
		for (int i : stack) {
			System.out.print(""+i+" ");
		}
		System.out.println();
	}

}
