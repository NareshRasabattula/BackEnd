package com.durga.LeetCode.Medium;
// https://leetcode.com/problems/integer-to-roman/
// http://buttercola.blogspot.com/2014/09/leetcode-integer-to-roman.html
public class M_0012_IntegerToRoman {

	public String intToRoman(int num) {
		String[] str = new String[] {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		int[] val = new int[] {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < val.length; i++) {
			while (num >= val[i]) {
				num -= val[i];
				sb.append(str[i]);
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		M_0012_IntegerToRoman obj = new M_0012_IntegerToRoman();
		System.out.println(obj.intToRoman(1994));
	}
}
