import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LargestSubarrayWithEqual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        // Creating the array
        int[] nums = new int[n];
        
        // Reading the elements of the array
        System.out.println("Enter the elements of the array (0s and 1s only): ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        // Find the largest subarray with equal number of 0s and 1s
        int[] result = findLargestSubarray(nums);
        if (result != null) {
            System.out.println("Largest subarray found from index " + result[0] + " to " + result[1]);
        } else {
            System.out.println("No such subarray exists.");
        }
        
        scanner.close();
    }
    
    public static int[] findLargestSubarray(int[] nums) {
        // Map to store the cumulative sum and its first occurrence index
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // Initialize with sum 0 at index -1
        
        int maxLen = 0;
        int sum = 0;
        int startIndex = -1;
        int endIndex = -1;
        
        for (int i = 0; i < nums.length; i++) {
            // Replace 0 with -1 for easier calculation
            sum += (nums[i] == 0) ? -1 : 1;
            
            if (map.containsKey(sum)) {
                int len = i - map.get(sum);
                if (len > maxLen) {
                    maxLen = len;
                    startIndex = map.get(sum) + 1;
                    endIndex = i;
                }
            } else {
                map.put(sum, i);
            }
        }
        
        if (maxLen == 0) {
            return null; // No subarray found
        }
        
        return new int[]{startIndex, endIndex};
    }
}
