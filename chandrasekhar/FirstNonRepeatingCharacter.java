import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading the input string
        System.out.print("Enter the string: ");
        String s = scanner.nextLine();

        // Find and print the index of the first non-repeating character
        int index = firstUniqChar(s);
        if (index != -1) {
            System.out.println("The index of the first non-repeating character is: " + index);
        } else {
            System.out.println("There is no non-repeating character in the string.");
        }

        scanner.close();
    }

    public static int firstUniqChar(String s) {
        // Map to store the frequency of each character
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Populate the frequency map
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Find the first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            if (frequencyMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        // If no non-repeating character exists, return -1
        return -1;
    }
}
