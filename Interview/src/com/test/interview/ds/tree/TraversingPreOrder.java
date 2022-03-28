package com.test.interview.ds.tree;

import java.util.Stack;

/**
 * Visit the root node
 * Traverse left sub tree node in Pre order fashion
 * Traverse right sub tree node in Post order fashion  
 */
public class TraversingPreOrder {
	
	public void preOrderRecursively(TreeNode root) {
		if(root == null) {
			return;
		}
		System.out.print(" "+root.data);
		preOrderRecursively(root.left);
		preOrderRecursively(root.right);
	}
	
	public void preOrderIterative(TreeNode root) {
		if(root == null) {
			return;
		}
		
		Stack<TreeNode> treeStack = new Stack<>();
		treeStack.push(root);
		
		while (!treeStack.isEmpty()) {
			TreeNode tempTreeNode = treeStack.pop();
			System.out.print(" "+tempTreeNode.data);
			
			if(tempTreeNode.right !=null) {
				treeStack.push(tempTreeNode.right);
			}
			if(tempTreeNode.left !=null) {
				treeStack.push(tempTreeNode.left);
			}
		}
	}
}
