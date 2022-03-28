package com.test.interview.ds.tree;

public class TreeTest {

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
		
		//Pre order traversing
		System.out.println("Pre order traversing");
		TraversingPreOrder preTraversingPreOrder = new TraversingPreOrder();
		preTraversingPreOrder.preOrderRecursively(root);
		System.out.println();
		preTraversingPreOrder.preOrderIterative(root);
		
		//In order traversing
		System.out.println();
		System.out.println("In order traversing");
		TraversingInOrder inTraversingPreOrder = new TraversingInOrder();
		inTraversingPreOrder.inOrderRecursively(root);
		System.out.println("");
		inTraversingPreOrder.inOrderIterative(root);
		
		//Post order traversing
		System.out.println();
		System.out.println("Post order traversing");
		TraversingPostOrder postTraversingPreOrder = new TraversingPostOrder();
		postTraversingPreOrder.postOrderRecursively(root);
		System.out.println("");
		postTraversingPreOrder.postOrderIterative(root);
		
		//Level order traversing
		System.out.println();
		System.out.println("Level order traversing");
		TraversingLevelOrder levelTraversingPreOrder = new TraversingLevelOrder();
		levelTraversingPreOrder.levelOrderIterative(root);
		
		System.out.println();
		System.out.println("Binary Search Tree insertion");
		BinarySearchTree.insert(5);
		BinarySearchTree.insert(3);
		BinarySearchTree.insert(7);
		BinarySearchTree.insert(1);
		BinarySearchTree.inorderTraverse();
		
		System.out.println();
		System.out.println("BST searching");
		TreeNode searchedNode = BinarySearchTree.search(3);
		if(searchedNode == null) {
			System.out.println("not found");
		}else {
			System.out.println("found => "+searchedNode.data);
		}
		
		System.out.println();
		System.out.println("BST Validation");
		System.out.println("Is valid BST => "+BinarySearchTree.isValidBST());
		System.out.println("Is valid BST => "+BinarySearchTree.isValidBST(root));
		
		////////////////////General Tree///////////////////
		System.out.println();
		System.out.println("Maximum value");
		System.out.println(BinaryTree.findMax(root));
		
		System.out.println();
		System.out.println("Tree height "+BinaryTree.calculateHeight(root));
	}
}
