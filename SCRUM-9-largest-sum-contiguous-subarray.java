import java.io.*;
import java.util.*;

class Kadane {
    // Driver Code
    public static void main(String[] args)
    {
        int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println("Maximum contiguous sum is "
                           + maxSubArraySum(a));
    }

    // Function Call
    static int maxSubArraySum(int a[])
    {
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here
          
    } 
} return maxSoFar; 
} public static void main(String[] args) { 
  // Test cases 
  int[] arr1 = {-2, -3, 4, -1, -2, 1, 5, -3}; 
  int[] arr2 = {2}; 
  System.out.println("Largest sum contiguous subarray (arr1): " + maxSubArraySum(arr1)); 
  // Output: 7 
  System.out.println("Largest sum contiguous subarray (arr2): " + maxSubArraySum(arr2)); 
  // Output: 2 
}
