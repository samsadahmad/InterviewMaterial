package com.test.interview.ds.queue;

public class Queue {
	
	private int[] queue;
	private int front, rear, size;
	private int capacity;
	
	
	public Queue(int capacity) {
		this.capacity = capacity;
		queue = new int[capacity];
	}
	
	public void enqueue(int data) {
		if(isFull()) {
			System.out.println("Queue is full");
		}else {
			queue[rear] = data;
			rear = (rear + 1)%capacity;
			size = size+1;
		}
	}
	
	public int dequeue() {
		int data = queue[front];
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}else {
			front = (front + 1)%capacity;
			size = size -1;
		}
		return data;
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return getSize() == 0;
	}
	
	public boolean isFull() {
		return getSize() == capacity;
	}
	
	public void show() {
		System.out.println();
		for (int i = 0; i < size; i++) {
			System.out.print(""+queue[(front+i)%capacity]+" ");
		}
	}

}
