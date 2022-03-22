package com.test.interview.ds.linkedlist;

public class LinkedList {
	
	private Node head;
	
	public void insert(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		
		if(head==null) {
			head = newNode;
		}else {
			Node tempNode = head;
			while (tempNode.next!=null) {
				tempNode = tempNode.next;
			}
			tempNode.next = newNode;
		}
	}
	
	public void insertAtStart(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		
		newNode.next = head;
		head = newNode;
	}
	
	public void insertAt(int pos, int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		
		if (pos == 0) {
			insertAtStart(data);
		}else {
			Node temp = head;
			for (int i = 0; i < pos-1; i++) {
				temp = temp.next;
			}
			Node ttt = temp.next;
			temp.next = newNode;
			newNode.next = ttt;
		}
	}
	
	public void deleteAt(int index) {
		if(index == 0) {
			head = head.next;
		}else {
			Node tempNode = head;
			for (int i = 0; i < index-1; i++) {
				tempNode = tempNode.next;
			}
			Node tttt = tempNode.next.next;
			tempNode.next = tttt;
		}
	}
	
	public void show() {
		Node tempNode = head;
		while (tempNode.next!=null) {
			System.out.println(""+tempNode.data);
			tempNode = tempNode.next;
		}
		System.out.println(""+tempNode.data);
	}

}
