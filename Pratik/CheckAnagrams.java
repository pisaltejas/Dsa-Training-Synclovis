import java.util.HashMap;
import java.util.Map;

public class CheckAnagrams {

    public static boolean isAnagram(String str1, String str2) {
      if (str1.length() != str2.length()) { // Check string lengths first for efficiency
        return false;
      }
  
      // Use a HashMap to store character counts
      Map<Character, Integer> charCountMap = new HashMap<>();
  
      // Count character occurrences in str1
      for (char c : str1.toLowerCase().toCharArray()) {
        int count = charCountMap.getOrDefault(c, 0) + 1;
        charCountMap.put(c, count);
      }
  
      // Check if characters in str2 have the same count as in str1 (ignoring case)
      for (char c : str2.toLowerCase().toCharArray()) {
        int count = charCountMap.getOrDefault(c, 0);
        if (count == 0) {
          return false;
        }
        charCountMap.put(c, count - 1);
      }
  
      // If all characters in str2 have corresponding counts in str1 (and are now 0 in the map), they are anagrams
      for (int value : charCountMap.values()) {
        if (value != 0) {
          return false;
        }
      }
  
      return true;
    }
  
    public static void main(String[] args) {
      String str1 = "innovate";
      String str2 = "oven";
      String str3 = "synclovers";
      String str4 = "versynclos";
  
      System.out.println(str1 + " and " + str2 + " are anagrams: " + isAnagram(str1, str2));
      System.out.println(str3 + " and " + str4 + " are anagrams: " + isAnagram(str3, str4));
    }
  }
  