package com.durga.GeeksForGeeks.Heap_Hash;
/*
 * http://www.geeksforgeeks.org/check-if-a-given-binary-tree-is-heap/
 * conditions for being a heap :-
 * It should be a complete tree (i.e. all levels except last should be full).
 * Every node�s value should be greater than or equal to its child node (considering max-heap).
*/

//A Binary Tree node
class Node{
	int key;
	Node left, right;

	Node(int k){
		key = k;
		left = right = null;
	}
}
public class Hp11_CheckBinaryTreeIsHeap {

	/* This function counts the number of nodes in a binary tree */
	int countNodes(Node root){
		if(root==null)
			return 0;
		return(1 + countNodes(root.left) + countNodes(root.right));
	}

	/* This function checks if the binary tree is complete or not */
	boolean isCompleteUtil(Node root, int index, int number_nodes){
		// An empty tree is complete
		if(root == null)
			return true;

		// If index assigned to current node is more than
		// number of nodes in tree, then tree is not complete
		if(index >= number_nodes)
			return false;

		// Recur for left and right subtrees
		return isCompleteUtil(root.left, 2*index+1, number_nodes) && 
				isCompleteUtil(root.right, 2*index+2, number_nodes);

	}

	// This Function checks the heap property in the tree.
	boolean isHeapUtil(Node root){
		//  Base case : single node satisfies property
		if(root.left == null && root.right==null)
			return true;

		//  node will be in second last level
		if(root.right == null){
			//  check heap property at Node
			//  No recursive call , because no need to check last level
			return root.key >= root.left.key;
		}
		else{
			//  Check heap property at Node and
			//  Recursive check heap property at left and right subtree
			if(root.key >= root.left.key && root.key >= root.right.key)
				return isHeapUtil(root.left) && isHeapUtil(root.right);
			else
				return false;
		}
	}

	//  Function to check binary tree is a Heap or Not.
	boolean isHeap(Node root){
		if(root == null)
			return true;

		// These two are used in isCompleteUtil()
		int node_count = countNodes(root);

		if(isCompleteUtil(root, 0 , node_count)==true && isHeapUtil(root)==true)
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		Hp11_CheckBinaryTreeIsHeap bt = new Hp11_CheckBinaryTreeIsHeap();

		Node root = new Node(10);
		root.left = new Node(9);
		root.right = new Node(8);
		root.left.left = new Node(7);
		root.left.right = new Node(6);
		root.right.left = new Node(5);
		root.right.right = new Node(4);
		root.left.left.left = new Node(3);
		root.left.left.right = new Node(2);
		root.left.right.left = new Node(1);

		if(bt.isHeap(root) == true)
			System.out.println("Given binary tree is a Heap");
		else
			System.out.println("Given binary tree is not a Heap");
	}
}
