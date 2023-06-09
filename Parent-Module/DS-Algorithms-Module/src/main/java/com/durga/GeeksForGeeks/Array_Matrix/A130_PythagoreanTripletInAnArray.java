package com.durga.GeeksForGeeks.Array_Matrix;
import java.util.Arrays;
/*
 * http://www.geeksforgeeks.org/find-pythagorean-triplet-in-an-unsorted-array/
 * O(n2)
 */
public class A130_PythagoreanTripletInAnArray {

	// Returns true if there is a triplet with following property
    // A[i]*A[i] = A[j]*A[j] + A[k]*[k]
    // Note that this function modifies given array
    public boolean isTriplet(int arr[], int n) {
        // Square array elements
        for (int i=0; i<n; i++)
            arr[i] = arr[i]*arr[i];
  
        // Sort array elements
        Arrays.sort(arr);
  
        // Now fix one element one by one and find the other two
        // elements
        for (int i = n-1; i >= 2; i--) {
            // To find the other two elements, start two index
            // variables from two corners of the array and move
            // them toward each other
            int l = 0; // index of the first element in arr[0..i-1]
            int r = i-1; // index of the last element in arr[0..i-1]
            while (l < r) {
                // A triplet found
                if (arr[l] + arr[r] == arr[i])
                    return true;
  
                // Else either move 'l' or 'r'
                if (arr[l] + arr[r] < arr[i])
                   l++;
                else
                   r--;
            }
        }
        // If we reach here, then no triplet found
        return false;
    }
    
	public static void main(String[] args) {
		A130_PythagoreanTripletInAnArray obj = new A130_PythagoreanTripletInAnArray();
		int arr[] = {3, 1, 4, 6, 5};
        int arr_size = arr.length;
        if (obj.isTriplet(arr,arr_size)==true)
           System.out.println("Yes");
        else
           System.out.println("No");   
	}
}
