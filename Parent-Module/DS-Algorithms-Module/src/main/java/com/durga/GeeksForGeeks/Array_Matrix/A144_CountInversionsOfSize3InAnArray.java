package com.durga.GeeksForGeeks.Array_Matrix;
import java.util.Arrays;
/*
 * http://www.geeksforgeeks.org/count-inversions-of-size-three-in-a-give-array/
 * Time Complexity : O(n log n)
 * Auxiliary Space : O(n)
 */
public class A144_CountInversionsOfSize3InAnArray {

	// Returns sum of arr[0..index]. This function assumes
	   // that the array is preprocessed and partial sums of
	   // array elements are stored in BITree[].
	    int getSum(int BITree[], int index) {
	        int sum = 0; // Initialize result
	 
	        // Traverse ancestors of BITree[index]
	        while (index > 0) {
	 
	            // Add current element of BITree to sum
	            sum += BITree[index];
	 
	            // Move index to parent node in getSum View
	            index -= index & (-index);
	        }
	        return sum;
	    }
	 
	    // Updates a node in Binary Index Tree (BITree) at given
	    // index in BITree.  The given value 'val' is added to 
	    // BITree[i] and  all of its ancestors in tree.
	    void updateBIT(int BITree[], int n, int index, int val) {
	     
	        // Traverse all ancestors and add 'val'
	        while (index <= n) {
	     
	            // Add 'val' to current node of BI Tree
	            BITree[index] += val;
	 
	            // Update index to that of parent in update View
	            index += index & (-index);
	        }
	    }
	 
	    // Converts an array to an array with values from 1 to n
	    // and relative order of smaller and greater elements remains
	    // same.  For example, {7, -90, 100, 1} is converted to
	    // {3, 1, 4 ,2 }
	    void convert(int arr[], int n) {
	         
	        // Create a copy of arrp[] in temp and sort the temp array
	        // in increasing order
	        int temp[]= new int[n];
	        for (int i = 0; i < n; i++) {
	            temp[i] = arr[i];
	        }
	        Arrays.sort(temp);
	 
	        // Traverse all array elements
	        for (int i = 0; i < n; i++) {
	        
	            // lower_bound() Returns pointer to the first element
	            // greater than or equal to arr[i]
	            arr[i] = Arrays.binarySearch(temp, arr[i])  + 1;
	        }
	    }
	 
	    // Returns count of inversions of size three
	    int getInvCount(int arr[], int n) {
	        
	        // Convert arr[] to an array with values from 1 to n and
	        // relative order of smaller and greater elements remains
	        // same.  For example, {7, -90, 100, 1} is converted to
	        //  {3, 1, 4 ,2 }
	        convert(arr, n);
	 
	        // Create and initialize smaller and greater arrays
	        int greater1[]= new int[n];
	        int smaller1[]= new int[n];
	        for (int i = 0; i < n; i++) {
	            greater1[i] = smaller1[i] = 0;
	        }
	 
	        // Create and initialize an array to store Binary
	        // Indexed Tree
	        int BIT[]= new int[n+1];
	        for (int i = 1; i <= n; i++) {
	            BIT[i] = 0;
	        }
	 
	        for (int i = n - 1; i >= 0; i--) {
	            smaller1[i] = getSum(BIT, arr[i] - 1);
	            updateBIT(BIT, n, arr[i], 1);
	        }
	 
	        // Reset BIT
	        for (int i = 1; i <= n; i++) {
	            BIT[i] = 0;
	        }
	 
	        // Count greater elements
	        for (int i = 0; i < n; i++) {
	            greater1[i] = i - getSum(BIT, arr[i]);
	            updateBIT(BIT, n, arr[i], 1);
	        }
	 
	        // Compute Inversion count using smaller[] and
	        // greater[]. 
	        int invcount = 0;
	        for (int i = 0; i < n; i++) {
	            invcount += smaller1[i] * greater1[i];
	        }
	 
	        return invcount;
	    }
	 
	    // Driver program to test above function
	    public static void main(String args[]) {
	    	A144_CountInversionsOfSize3InAnArray tree = new A144_CountInversionsOfSize3InAnArray();
	        int[] arr = new int[]{8, 4, 2, 1};
	        int n = arr.length;
	        System.out.print( "Inversion Count : " + 
	                           tree.getInvCount(arr, n));
	    }
}
