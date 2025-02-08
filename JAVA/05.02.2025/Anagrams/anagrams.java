package example;

import java.util.*;

public class anagrams{
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int[] charCount = new int[26];

        for (char c : p.toCharArray()) charCount[c - 'a']++;

        for (int i = 0; i <= s.length() - p.length(); i++) {
            int[] tempCount = charCount.clone();
            for (int j = i; j < i + p.length(); j++) tempCount[s.charAt(j) - 'a']--;

            if (Arrays.equals(tempCount, new int[26])) result.add(i);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string (s): ");
        String s = scanner.nextLine();

        System.out.print("Enter the pattern (p): ");
        String p = scanner.nextLine();

        List<Integer> result = findAnagrams(s, p);
        System.out.println("Anagram indices: " + result);

        scanner.close();
    }
}