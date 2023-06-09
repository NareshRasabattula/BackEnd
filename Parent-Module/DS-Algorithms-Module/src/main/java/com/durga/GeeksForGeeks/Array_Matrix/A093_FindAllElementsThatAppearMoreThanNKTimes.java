package com.durga.GeeksForGeeks.Array_Matrix;
import java.util.*;
/*
 * http://www.geeksforgeeks.org/given-an-array-of-of-size-n-finds-all-the-elements-that-appear-more-than-nk-times/
 * good question like a tetris game
 */
class eleCount{
	int e;  // Element
	int c;  // Count
}
public class A093_FindAllElementsThatAppearMoreThanNKTimes {
	// Prints elements with more than n/k occurrences in arr[] of size n. If there are no such elements, then it prints nothing.
	public static void findKRepeatedElements(int [] arr, int k) {
		int n = arr.length,i = 0;
		// k must be greater than 1 to get some output
		if (k < 2)	return;
		/* Step 1: Create a temporary array (contains element and count) of size k-1. Initialize count of all elements as 0 */
		eleCount temp[] = new eleCount[k-1];
		/* Step 2: Process all elements of input array */
		for (i = 0; i < n; i++){
			int j = 0;
			/* If arr[i] is already present in the element count array, then increment its count */
			for (j = 0; j < k-1; j++){
				temp[j] = new eleCount();
				if (temp[j].e == arr[i]){
					temp[j].c += 1;
					break;
				}
			}
			/* If arr[i] is not present in temp[] */
			if (j == k-1){
				int l = 0;
				/* If there is position available in temp[], then place arr[i] in the first available position and set count as 1*/
				for (l = 0; l < k-1; l++){
					temp[l] = new eleCount();
					if (temp[l].c == 0){
						temp[l].e = arr[i];
						temp[l].c = 1;
						break;
					}
				}
				/* If all the position in the temp[] are filled, then decrease count of every element by 1 */
				if (l == k-1)
					for (l = 0; l < k; l++)
						temp[l].c -= 1;
			}
		}
		/*Step 3: Check actual counts of potential candidates in temp[]*/
		for (i = 0; i < k-1; i++){
			// Calculate actual count of elements 
			int ac = 0;  // actual count
			for (int j = 0; j < n; j++)
				if (arr[j] == temp[i].e)
					ac++;

			// If actual count is more than n/k, then print it
			if (ac > n/k)
				System.out.println("Number:" + temp[i].e+ " Count:" + ac);
		}
	}
	public static void main(String[] args) {
		A093_FindAllElementsThatAppearMoreThanNKTimes obj = new A093_FindAllElementsThatAppearMoreThanNKTimes();
		int [] A = {4, 5, 6, 7, 8, 4, 4};
		obj.findKRepeatedElements(A, 4); //K=4
	}
}
