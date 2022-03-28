package com.test.interview.ds.tree;

import java.util.Stack;

public class TraversingPostOrder {
	
	/**
	 * Traverse left sub tree node in Post order fashion
	 * Traverse left sub tree node in Post order fashion
	 * Visit root node 
	 */
	public void postOrderRecursively(TreeNode root) {
		if(root == null) {
			return;
		}
		postOrderRecursively(root.left);
		postOrderRecursively(root.right);
		System.out.print(" "+root.data);
	}
	
	public void postOrderIterative(TreeNode root) {
		if(root == null) {
			return;
		}
		
		Stack<TreeNode> stackTree = new Stack<>();
		TreeNode currentNode = root;
		
		while (currentNode!=null || !stackTree.isEmpty()) {
			if(currentNode!=null) {
				stackTree.push(currentNode);
				currentNode = currentNode.left;
			}else {
				TreeNode tempNode = stackTree.peek().right;
				if(tempNode == null) {
					tempNode = stackTree.pop();
					System.out.print(" "+tempNode.data);
					while (!stackTree.isEmpty() && tempNode == stackTree.peek().right) {
						tempNode = stackTree.pop();
						System.out.print(" "+tempNode.data);
					}
				}else {
					currentNode = tempNode;
				}
			}
		}
	}
}
