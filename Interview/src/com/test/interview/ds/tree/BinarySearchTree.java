package com.test.interview.ds.tree;

/**
 * It's type of Binary Tree which data is organized in ordered manner
 * which helps in faster search and insertion of data. It satifies following properties :
 * a) The left subtree of node contains only nodes with lesser that the node's value
 * b) The right subtree of node contains only nodes with greater that the node's value
 * c) The left and right subtree each must also be a Binary serach tree
 */
public class BinarySearchTree {
	
	private static TreeNode root;
	
	public static TreeNode search(int key) {
		return search(root, key);
	}
	
	public static boolean isValidBST() {
		return isValid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	public static boolean isValidBST(TreeNode root) {
		return isValid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	public static boolean isValid(TreeNode root, int min, int max) {
		if(root == null) {
			return true;
		}
		if(root.data <= min || root.data >= max ) {
			return false;
		}
		
		boolean left = isValid(root.left, min, root.data);
		if(left) {
			return isValid(root.right, root.data, max);
		}
		return false;
	}

	public static TreeNode search(TreeNode root, int key) {
		if(root == null || key == root.data) {
			return root;
		}
		
		if(key < root.data) {
			return search(root.left, key);
		}else {
			return search(root.right, key);
		}
	}
	
	public static void insert(int value) {
		root = insertRecursively(root, value);
	}
	
	public static TreeNode insertRecursively(TreeNode root, int value) {
		if(root == null) {
			root = new TreeNode(value);
			return root;
		}
		
		if(value < root.data) {
			root.left = insertRecursively(root.left, value);
		}else {
			root.right = insertRecursively(root.right, value);
		}
		return root;
	}
	
	public static void inorderTraverse() {
		inorder(root);
	}
	
	private static void inorder(TreeNode root) {
		if(root == null) return;
		inorder(root.left);
		System.out.print(" "+root.data);
		inorder(root.right);
	}
}
