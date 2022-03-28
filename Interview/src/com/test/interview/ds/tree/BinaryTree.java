package com.test.interview.ds.tree;

public class BinaryTree {
	
	public static void main(String[] args) {
		TreeNode one = new TreeNode(1);
		TreeNode two = new TreeNode(2);
		TreeNode three = new TreeNode(3);
		TreeNode four = new TreeNode(4);
		TreeNode five = new TreeNode(5);
		TreeNode six = new TreeNode(6);
		TreeNode seven = new TreeNode(7);
		
		TreeNode root = one;
		root.left = two;
		root.right = three;
		root.left.left = four;
		root.left.right = five;
		root.right.left = six;	
		root.right.right = seven;
		
		
		System.out.println("Tree are identical "+isTreeIdenticatl(root, root));
		System.out.println("Tree are Mirror "+isTreeMirrored(root, root));
	}
	
	public static boolean isTreeBalance(TreeNode root) {
		if(root == null) {
			return true;
		}
		int lh = calculateHeight(root.left);
		int rh = calculateHeight(root.right);
		
		return (Math.abs(lh - rh) <= 1) && isTreeBalance(root.left) && isTreeBalance(root.right);
	}
	
	public static boolean isTreeSymmetric(TreeNode root) {
		if(root == null) {
			return false;
		}
		return isTreeIdenticatl(root.left, root.right);
	}
	
	public static boolean isTreeMirrored(TreeNode root1, TreeNode root2) {
		if(root1 == null && root2 ==null) {
			return true;
		}
		if(root1 == null || root2 ==null) {
			return false;
		}
		
		return root1.data == root2.data && isTreeMirrored(root1.left, root2.right) && isTreeMirrored(root1.right, root2.left);
	}
	public static boolean isTreeIdenticatl(TreeNode root1, TreeNode root2) {
		if(root1 == null || root2 ==null) {
			return root1 == null && root2 ==null;
		}
		if(root1.data != root2.data) {
			return false;
		}
		return isTreeIdenticatl(root1.left, root2.left) && isTreeIdenticatl(root1.right, root2.right);
	}
	
	public static int findMax(TreeNode root) {
		if(root == null) { // Base case
			return Integer.MIN_VALUE;
		}
		int result = root.data;
		int left = findMax(root.left);
		int right = findMax(root.right);
		
		if(left > result) {
			result = left;
		}
		if(right > result){
			result = right;
		}
		return result;
	}
	
	public static int calculateHeight(TreeNode root) {
		if(root == null) {
			return 0;
		}
		
		int leftHeight = calculateHeight(root.left);
		int rightHeight = calculateHeight(root.right);
		
		return 1+Math.max(leftHeight, rightHeight);
	}
}
