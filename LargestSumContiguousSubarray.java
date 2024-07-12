public class LargestSumContiguousSubarray {

  public static int maxSubarraySum(int[] arr) {
    int maxSoFar = arr[0]; // Initialize with the first element
    int maxEndingHere = arr[0]; // Initialize with the first element

    for (int num : arr) {
      // Consider starting a new subarray or adding the current element to the existing one
      maxEndingHere = Math.max(num, maxEndingHere + num); // Take the larger sum
      maxSoFar = Math.max(maxSoFar, maxEndingHere); // Update maxSoFar if necessary
    }
    return maxSoFar;
  }

  public static void main(String[] args) {
    int[] arr1 = {-2, -3, 4, -1, -2, 1, 5, -3};
    int[] arr2 = {2};
    
    int maxSum1 = maxSubarraySum(arr1);
    int maxSum2 = maxSubarraySum(arr2);

    System.out.println("Maximum sum for arr1: " + maxSum1);
    System.out.println("Maximum sum for arr2: " + maxSum2);
  }
}
