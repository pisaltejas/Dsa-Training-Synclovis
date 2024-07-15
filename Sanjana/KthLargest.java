 import java.util.Arrays;
   public class KthLargest {
   public static int findKthLargestSort(int[] nums, int k) {
      Arrays.sort(nums);
        return nums[nums.length - k];
     }
     public static void main(String[] args) {
         int[] nums = {3, 2, 1, 5, 6, 4};
         int k = 2;
         System.out.println(findKthLargestSort(nums, k)); 
     }
   }
