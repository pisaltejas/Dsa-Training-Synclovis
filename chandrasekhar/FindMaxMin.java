import java.util.Scanner;

public class FindMaxMin {
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

        // Finding max and min
        int maxElement = findMax(arr);
        int minElement = findMin(arr);

        // Printing the results
        System.out.println("Max: " + maxElement + ", Min: " + minElement);

        // Closing the scanner
        scanner.close();
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
