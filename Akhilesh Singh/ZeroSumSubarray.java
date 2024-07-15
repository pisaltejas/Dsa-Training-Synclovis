import java.util.HashSet;

public class ZeroSumSubarray {
    public static boolean hasZeroSumSubarray(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;

        for (int num : arr) {
            sum += num;

            if (sum == 0 || set.contains(sum)) {
                return true;
            }

            set.add(sum);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };

        if (hasZeroSumSubarray(arr)) {
            System.out.println("Subarray with zero-sum exists");
        } else {
            System.out.println("No subarray with zero-sum exists");
        }
    }
}
