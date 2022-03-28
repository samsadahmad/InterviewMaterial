package com.test.interview.ds.tree;

import java.util.LinkedList;
import java.util.Queue;

public class TraversingLevelOrder {
	
	public void levelOrderIterative(TreeNode root) {
		if(root == null) return;
		Queue<TreeNode> queueTree = new LinkedList<>();
		queueTree.offer(root);
		
		while (!queueTree.isEmpty()) {
			TreeNode temp = queueTree.poll();
			System.out.print(" "+temp.data);
			
			if(temp.left !=null) {
				queueTree.offer(temp.left);
			}
			if(temp.right !=null) {
				queueTree.offer(temp.right);
			}
		}
	}

}
