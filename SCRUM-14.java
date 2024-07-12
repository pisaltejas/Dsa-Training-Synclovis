import java.util.HashSet;
import java.util.Set;

public class Intersection {

  public static int[] findIntersection(int[] arr1, int[] arr2) {
    // Use a HashSet to efficiently store unique elements
    Set<Integer> set1 = new HashSet<>();
    for (int num : arr1) {
      set1.add(num);
    }

    Set<Integer> intersection = new HashSet<>();
    for (int num : arr2) {
      // Check if element exists in set1 (from arr1) and add it to the intersection set if unique
      if (set1.contains(num)) {
        intersection.add(num);
      }
    }

    // Convert the intersection set to an int array and return
    int[] result = new int[intersection.size()];
    int i = 0;
    for (int num : intersection) {
      result[i++] = num;
    }
    return result;
  }

  public static void main(String[] args) {
    int[] arr1 = {1, 2, 2, 1};
    int[] arr2 = {2, 2};
    int[] intersection = findIntersection(arr1, arr2);
    System.out.print("Intersection: ");
    for (int num : intersection) {
      System.out.print(num + " ");
    }
  }
}
