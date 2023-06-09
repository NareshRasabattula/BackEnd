package com.durga.LeetCode.Medium;

import java.util.*;

/*
 * https://leetcode.com/problems/mini-parser/
 */
public class M_0385_MiniParser {
	
	//https://leetcode.com/problems/mini-parser/discuss/86066/An-Java-Iterative-Solution
	/*
		If encounters '[', push current NestedInteger to stack and start a new one.
		If encounters ']', end current NestedInteger and pop a NestedInteger from stack to continue.
		If encounters ',', append a new number to curr NestedInteger, if this comma is not right after a brackets.
		Update index l and r, where l shall point to the start of a integer substring, while r shall points to the end+1 of substring.
	*/
	
	/**
	public NestedInteger deserialize(String s) {
		if (s.isEmpty())
			return null;
		if (s.charAt(0) != '[') // ERROR: special case
			return new NestedInteger(Integer.valueOf(s));

		Stack<NestedInteger> stack = new Stack<>();
		NestedInteger curr = null;
		int l = 0; // l shall point to the start of a number substring;
					// r shall point to the end+1 of a number substring
		for (int r = 0; r < s.length(); r++) {
			char ch = s.charAt(r);
			if (ch == '[') {
				if (curr != null) {
					stack.push(curr);
				}
				curr = new NestedInteger();
				l = r + 1;
			} else if (ch == ']') {
				String num = s.substring(l, r);
				if (!num.isEmpty())
					curr.add(new NestedInteger(Integer.valueOf(num)));
				if (!stack.isEmpty()) {
					NestedInteger pop = stack.pop();
					pop.add(curr);
					curr = pop;
				}
				l = r + 1;
			} else if (ch == ',') {
				if (s.charAt(r - 1) != ']') {
					String num = s.substring(l, r);
					curr.add(new NestedInteger(Integer.valueOf(num)));
				}
				l = r + 1;
			}
		}

		return curr;
	}
	 **/
}
