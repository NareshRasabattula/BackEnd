package com.durga.LeetCode.Easy;
import java.util.*;
/*
 * https://leetcode.com/problems/string-matching-in-an-array/
 */
public class E_1408_StringMatchingInArray {

	public List<String> stringMatching(String[] words) {
		HashSet<String> set = new HashSet<>();

		for (int i = 0; i < words.length - 1; i++) {
			String currWord = words[i];
			for (int j = i + 1; j < words.length; j++) {
				String nextWord = words[j];

				if (currWord.contains(nextWord)) {
					set.add(nextWord);
				}

				if (nextWord.contains(currWord)) {
					set.add(currWord);
				}
			}
		}

		List<String> res = new ArrayList<String>(set); // convert hashset to list
		return res;
	}

	public static void main(String[] args) {
		E_1408_StringMatchingInArray obj = new E_1408_StringMatchingInArray();
		System.out.println(obj.stringMatching(new String[] { "mass", "as", "hero", "superhero" }));
	}
}
