
package String;

import java.util.HashMap;
import java.util.Map;

public class MaxCharInString {
    public static void main(String[] args) {

        String str = "apple";

        System.out.println(findMaxOccurringCharUsingAsciiValues(str));
        System.out.println(findMaxOccurringCharUsingHashMap(str));
    }

    // Using ASCII Values
    static char findMaxOccurringCharUsingAsciiValues(String str) {
        int[] count = new int[256];

        for (char c : str.toCharArray()) {
            count[c]++;
        }

        char maxChar = str.charAt(0);
        int maxCount = count[maxChar];

        for (char c : str.toCharArray()) {
            if (count[c] > maxCount) {
                maxChar = c;
                maxCount = count[c];
            }
        }

        return maxChar;
    }

    // Using HashMap
    static char findMaxOccurringCharUsingHashMap(String str) {
        Map<Character, Integer> countMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        char maxChar = str.charAt(0);
        int maxCount = countMap.get(maxChar);

        for (char c : countMap.keySet()) {
            if (countMap.get(c) > maxCount) {
                maxChar = c;
                maxCount = countMap.get(c);
            }
        }

        return maxChar;
    }
}
