package String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";

        System.out.println(areAnagramsUsingSorting(str1, str2));
        System.out.println(areAnagramsUsingFrequencyCount(str1, str2));
        System.out.println(areAnagramsUsingCounters(str1, str2));
        System.out.println(areAnagramsUsingCounters2(str1, str2));
    }

    // Using Sorting
    static boolean areAnagramsUsingSorting(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    // Using Frequency Count
    static boolean areAnagramsUsingFrequencyCount(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        Map<Character, Integer> frequencyMap1 = createFrequencyMap(str1);
        Map<Character, Integer> frequencyMap2 = createFrequencyMap(str2);

        return frequencyMap1.equals(frequencyMap2);
    }

    static Map<Character, Integer> createFrequencyMap(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        return frequencyMap;
    }

    // Using Arrays as Counters
    static boolean areAnagramsUsingCounters(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] charCount = new int[26];

        for (char c : str1.toCharArray()) {
            charCount[c - 'a']++;
        }
        for (char c : str2.toCharArray()) {
            charCount[c - 'a']--;
        }

        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean areAnagramsUsingCounters2(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;

        int[] count = new int[256];
        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }

        for (int i = 0; i < 256; i++) {
            if (count[i] != 0)
                return false;
        }

        return true;
    }
}
