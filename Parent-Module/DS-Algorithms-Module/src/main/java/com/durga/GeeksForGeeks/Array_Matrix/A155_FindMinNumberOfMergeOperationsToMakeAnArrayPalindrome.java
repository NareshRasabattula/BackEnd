package com.durga.GeeksForGeeks.Array_Matrix;
/*
 * http://www.geeksforgeeks.org/find-minimum-number-of-merge-operations-to-make-an-array-palindrome/
 * O(n)
 */
public class A155_FindMinNumberOfMergeOperationsToMakeAnArrayPalindrome {

	// Returns minimum number of count operations
	// required to make arr[] palindrome
	public int findMinOps(int arr[]){
	    int ans = 0; // Initialize result
	    int n = arr.length;
	    // Start from two corners
	    for (int i=0,j=n-1; i<=j;){
	        // If corner elements are same,
	        // problem reduces arr[i+1..j-1]
	        if (arr[i] == arr[j]){
	            i++;
	            j--;
	        }
	 
	        // If left element is greater, then
	        // we merge right two elements
	        else if (arr[i] > arr[j]){
	            // need to merge from tail.
	            j--;
	            arr[j] += arr[j+1] ;
	            ans++;
	        }
	 
	        // Else we merge left two elements
	        else{
	            i++;
	            arr[i] += arr[i-1];
	            ans++;
	        }
	    }
	 
	    return ans;
	}
	public static void main(String[] args) {
		A155_FindMinNumberOfMergeOperationsToMakeAnArrayPalindrome obj = new A155_FindMinNumberOfMergeOperationsToMakeAnArrayPalindrome();
		int arr[] = {1, 4, 5, 9, 1};
	    System.out.println("Count of minimum operations is:"+obj.findMinOps(arr));
	}
}
