package com.test.interview.array;


public class ArrayDynamic {

	private int capacity = 5;
	private int[] arr;
	private int pointer = 0;

	public ArrayDynamic(int size) {
		this.capacity = size;
		arr = new int[size];
	}
	
	public void addElement(int val) {
		if(capacity > pointer) {
			arr[pointer] = val;
			pointer++;	
		}else {
			growArray(val);
		}
	}
	
	public void removeElement() {
		if(pointer>0) {
			arr[pointer-1] = 0;
			pointer--;
		}
	}
	
	public void removeElementAt(int index) {
		if(pointer>0) {
			for (int i = index; i < pointer; i++) {
				arr[i] = arr[i + 1];   
			}
			arr[pointer] = 0;
			pointer--;
		}
	}
	
	private void growArray(int val) {
		int[] tempArr = new int[capacity+capacity/2];
		System.arraycopy(arr, 0, tempArr, 0, capacity);
		capacity += capacity/2;
		arr = tempArr;
		addElement(val);
	}
	
	public void print() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
