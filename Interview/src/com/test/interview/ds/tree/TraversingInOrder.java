package com.test.interview.ds.tree;

import java.util.Stack;

public class TraversingInOrder {
	
	/**
	 * Traverse left sub tree node in In order fashion
	 * Visit root node
	 * Traverse left sub tree node in In order fashion 
	 */
	public void inOrderRecursively(TreeNode root) {
		if(root == null) {
			return;
		}
		inOrderRecursively(root.left);
		System.out.print(" "+root.data);
		inOrderRecursively(root.right);
	}
	
	public void inOrderIterative(TreeNode root) {
		if(root == null) {
			return;
		}
		
		Stack<TreeNode> stackTreeNode = new Stack<>();
		TreeNode tempNode = root;
		
		while (!stackTreeNode.isEmpty() || tempNode != null) {
			if(tempNode != null) {
				stackTreeNode.push(tempNode);
				tempNode = tempNode.left;
			}else {
				tempNode = stackTreeNode.pop();
				System.out.print(" "+tempNode.data);
				tempNode = tempNode.right;
			}
		}
	}
}
