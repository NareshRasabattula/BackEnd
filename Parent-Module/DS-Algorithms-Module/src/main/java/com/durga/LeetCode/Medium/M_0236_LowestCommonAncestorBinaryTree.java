package com.durga.LeetCode.Medium;

import com.durga.LeetCode.Helper.TreeNode;

import java.util.*;
/*
 * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
 */
public class M_0236_LowestCommonAncestorBinaryTree {

	/*
	 * recursive 
	 * Time complexity O(n) 
	 * Space complexity O(h)
	 */
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null || root == p || root == q)
			return root;

		TreeNode left = lowestCommonAncestor(root.left, p, q);
		TreeNode right = lowestCommonAncestor(root.right, p, q);

		if (left != null && right != null)
			return root;
		return left != null ? left : right;
	}

	// Iterative
	public TreeNode lowestCommonAncestorApproach2(TreeNode root, TreeNode p, TreeNode q) {

		// Stack for tree traversal
		Deque<TreeNode> stack = new ArrayDeque<>();

		// HashMap for parent pointers
		Map<TreeNode, TreeNode> parent = new HashMap<>();

		parent.put(root, null);
		stack.push(root);

		// Iterate until we find both the nodes p and q
		while (!parent.containsKey(p) || !parent.containsKey(q)) {

			TreeNode node = stack.pop();

			// While traversing the tree, keep saving the parent pointers.
			if (node.left != null) {
				parent.put(node.left, node);
				stack.push(node.left);
			}
			if (node.right != null) {
				parent.put(node.right, node);
				stack.push(node.right);
			}
		}

		// Ancestors set() for node p.
		Set<TreeNode> ancestors = new HashSet<>();

		// Process all ancestors for node p using parent pointers.
		while (p != null) {
			ancestors.add(p);
			p = parent.get(p);
		}

		// The first ancestor of q which appears in
		// p's ancestor set() is their lowest common ancestor.
		while (!ancestors.contains(q))
			q = parent.get(q);
		return q;
	}

	public static void main(String[] args) {
		M_0236_LowestCommonAncestorBinaryTree obj = new M_0236_LowestCommonAncestorBinaryTree();
		TreeNode root = TreeNode.createRandomBST(5);
		System.out.println(obj.lowestCommonAncestor(root, root.left, root.right).val);
		System.out.println(obj.lowestCommonAncestorApproach2(root, root.left, root.right).val);
	}
}
