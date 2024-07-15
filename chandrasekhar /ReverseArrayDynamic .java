import java.util.Scanner;

public class ReverseArrayDynamic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Creating the array
        int[] arr = new int[n];

        // Reading the elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Reversing the array
        reverseArray(arr);

        // Printing the reversed array
        System.out.print("Reversed array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Closing the scanner
        scanner.close();
    }

    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            // Swap the elements at the left and right indices
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move the indices towards the center
            left++;
            right--;
        }
    }
}
