package com.durga.LeetCode.Easy;
/*
 * https://leetcode.com/problems/largest-triangle-area/
 */
public class E_0812_LargestTriangleArea {

	public double largestTriangleArea(int[][] points) {
		int N = points.length;
		double ans = 0;
		for (int i = 0; i < N; ++i)
			for (int j = i+1; j < N; ++j)
				for (int k = j+1; k < N; ++k)
					ans = Math.max(ans, area(points[i], points[j], points[k]));
		return ans;
	}

	public double area(int[] P, int[] Q, int[] R) {
		return 0.5 * Math.abs(P[0]*Q[1] + Q[0]*R[1] + R[0]*P[1]
				-P[1]*Q[0] - Q[1]*R[0] - R[1]*P[0]);
	}
	public static void main(String[] args) {
		E_0812_LargestTriangleArea obj = new E_0812_LargestTriangleArea();
		int[][] points = new int[][] {
			{0,0},{0,1},{1,0},{0,2},{2,0}};
		System.out.println(obj.largestTriangleArea(points));
	}
}
