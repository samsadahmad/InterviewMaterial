package com.test.interview.array;

/**
 * Searching Algorithm
 * Linear Search
 * Binary Search
 */
public class ArraySearchTest {
	
	public static void main(String[] args) {
		//Linear search
		int inputArray[] = {19,1, 10,25, 2,4, 95, 11, 67};
		int linearSearchfoundPos = linerSearch(inputArray, 100);
		if(linearSearchfoundPos>0) {
			System.out.println("Linear Search - found key in array at pos "+ linearSearchfoundPos+ " and value is "+inputArray[linearSearchfoundPos]);
		}
		
		//Binary search
		int sortedArray[] = {10,11, 15, 25, 29 ,40, 50, 55, 67};
		int foundPos = binarySearch(55, sortedArray);
		System.out.println("found key in array at pos "+ foundPos+ " and value is "+sortedArray[foundPos]);
		
		int foundPos2 = binaryRecursiveSearch(55, sortedArray, 0, sortedArray.length-1);
		System.out.println("found key in array at pos "+ foundPos2+ " and value is "+sortedArray[foundPos2]);
	}
	
	/**
	 * Best case O(1)
	 * worst case  O(n)
	 * avg case O(n+1/2)
	 */
	private static int linerSearch(int[] inputArray, int key) {
		for (int i = 0; i < inputArray.length; i++) {
			if(key == inputArray[i]) {
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * 
	 * @param key
	 * @param sortedArray
	 * @return boolean
	 * complexity O(logn)
	 * 
	 * log base B pow n = k
	 * b pow k = n
	 */
	public static int binarySearch(int key, int[] sortedArray) {
		int size = sortedArray.length;
		int leftIndex = 0;
		int rightIndex = size-1;
		int midIndex = 0; 
				
		while(leftIndex <= rightIndex) {
			midIndex = (leftIndex + rightIndex)/2; 
			int midValue = sortedArray[midIndex];
			if(key == midValue) {
				return midIndex;
			}
			
			if(key > midValue) {
				leftIndex = midIndex+1;
			}else {
				rightIndex = midIndex-1;
			}
		}
		return -1;
	}
	
	public static int binaryRecursiveSearch(int key, int[] sortedArray, int low, int high) {
		if(low > high) return -1;
		int midIndex = (low+high)/2;
		
		int midValue = sortedArray[midIndex];
		if(key == midValue) {
			return midIndex;
		}
		
		if(key > midValue) {
			return binaryRecursiveSearch(key, sortedArray, midIndex+1, high);
		}else {
			return binaryRecursiveSearch(key, sortedArray, low, midIndex-1);
		}	
	}
}
