package com.durga.LeetCode.Easy;
import java.util.*;
/*
 * https://leetcode.com/problems/heaters/
 */
public class E_0475_Heaters {
	/*
	 * The idea is to leverage decent Arrays.binarySearch() function provided by Java.
	 * 
	 * For each house, find its position between those heaters (thus we need the heaters array to be sorted). 
	 * Calculate the distances between this house and left heater and right heater, get a MIN value of those two values. 
	 * Corner cases are there is no left or right heater. 
	 * Get MAX value among distances in step 2. It's the answer. 
	 * Time complexity: max(O(nlogn), O(mlogn)) - m is the length of houses, n is the length of heaters.
	 */
	public int findRadius(int[] houses, int[] heaters) {
		Arrays.sort(heaters);
		int result = 0;

		for (int house : houses) {
			int index = Arrays.binarySearch(heaters, house);
			// index = ~index;
			if (index < 0) index = -(index + 1);
			int dist1 = index - 1 >= 0 ? house - heaters[index - 1] : Integer.MAX_VALUE;
			int dist2 = index < heaters.length ? heaters[index] - house : Integer.MAX_VALUE;

			result = Math.max(result, Math.min(dist1, dist2));
		}
		return result;
	}
	public static void main(String[] args) {
		E_0475_Heaters obj = new E_0475_Heaters();
		int[] houses = {1, 5};
		int[] heaters = {7, 10};
		System.out.println(obj.findRadius(houses, heaters));
	}
}
