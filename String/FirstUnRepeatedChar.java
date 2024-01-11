package String;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class FirstUnRepeatedChar {
    public static void main(String[] args) {

        String str = "apple";

        System.out.println(findFirstUnrepeatedCharUsingArray(str));
        System.out.println(findFirstUnrepeatedCharUsingLinkedHashMap(str));
        System.out.println(findFirstUnrepeatedCharUsingHashSet(str));
    }

    // Using an Array
    static char findFirstUnrepeatedCharUsingArray(String str) {
        int[] charCount = new int[256];

        for (char c : str.toCharArray()) {
            charCount[c]++;
        }

        for (char c : str.toCharArray()) {
            if (charCount[c] == 1) {
                return c;
            }
        }

        throw new RuntimeException("No unrepeated characters found.");
    }

    // Using LinkedHashMap
    static char findFirstUnrepeatedCharUsingLinkedHashMap(String str) {
        Map<Character, Integer> charCount = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        throw new RuntimeException("No unrepeated characters found.");
    }

    // Using a HashSet and LinkedHashSet
    static char findFirstUnrepeatedCharUsingHashSet(String str) {
        Set<Character> repeatedChars = new HashSet<>();
        Set<Character> unrepeatedChars = new LinkedHashSet<>();

        for (char c : str.toCharArray()) {
            if (!repeatedChars.contains(c)) {
                if (!unrepeatedChars.add(c)) {
                    unrepeatedChars.remove(c);
                    repeatedChars.add(c);
                }
            }
        }

        if (!unrepeatedChars.isEmpty()) {
            return unrepeatedChars.iterator().next();
        }

        throw new RuntimeException("No unrepeated characters found.");
    }
}
