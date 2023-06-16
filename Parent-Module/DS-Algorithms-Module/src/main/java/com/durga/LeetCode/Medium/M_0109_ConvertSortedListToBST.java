package com.durga.LeetCode.Medium;
import com.durga.LeetCode.Helper.*;
/*
 * https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/
 */
public class M_0109_ConvertSortedListToBST {

	public TreeNode sortedListToBST(LinkListNode head) {


		return null;
	}

	public static void main(String[] args) {
		M_0109_ConvertSortedListToBST obj = new M_0109_ConvertSortedListToBST();
		LinkListNode head = LinkListNode.createLinkList();
		TreeNode root = obj.sortedListToBST(head);
		TreeNode.print(root);
	}
}
