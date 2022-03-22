package com.test.interview.ds.linkedlist;

public class LinkedListTest {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.insert(2);
		list.insert(4);
		list.insert(5);
		list.insertAtStart(1);
		list.insertAt(2, 3);
		list.deleteAt(2);
		list.show();
	}
}
