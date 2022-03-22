package com.test.interview.ds.queue;

public class QueueTest {

	public static void main(String[] args) {
		
		Queue queue = new Queue(5);
		
		queue.enqueue(4);
		queue.enqueue(7);
		queue.enqueue(9);
		queue.enqueue(10);
		queue.enqueue(12);
		
		System.out.println("Dequeue item "+queue.dequeue());
		
		queue.enqueue(15);
		queue.enqueue(20);
		
		
		queue.show();
	}

}
