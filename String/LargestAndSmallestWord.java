package String;

import java.util.StringTokenizer;

public class LargestAndSmallestWord {
    public static void main(String[] args) {

        String str = "Hardships often prepare ordinary people for an extraordinary destiny";
        System.out.println("Smallest: " + findSmallestWord(str));
        System.out.println("Largest: " + findLargestWord(str));
        System.out.println();

        String str2 = "Hardships often prepare ordinary people for an extraordinary destiny";
        largestAndSmallestWord(str2);
        System.out.println();

        String str4 = "Hardships often prepare ordinary people for an extraordinary destiny";
        System.out.println("Smallest: " + findSmallestWordWithTokenizer(str4));
        System.out.println("Largest: " + findLargestWordWithTokenizer(str4));
    }

    // Using Split and Iteration
    static String findSmallestWord(String input) {
        String[] words = input.split("\\s+");
        String smallestWord = words[0];

        for (String word : words) {
            if (word.length() < smallestWord.length()) {
                smallestWord = word;
            }
        }

        return smallestWord;
    }

    static String findLargestWord(String input) {
        String[] words = input.split("\\s+");
        String largestWord = words[0];

        for (String word : words) {
            if (word.length() > largestWord.length()) {
                largestWord = word;
            }
        }

        return largestWord;
    }

    public static void largestAndSmallestWord(String str) {
        String[] words = str.split(" ");
        String smallest = words[0];
        String largest = words[0];

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > largest.length()) {
                largest = words[i];
            } else if (words[i].length() < smallest.length()) {
                smallest = words[i];
            }
        }
        System.out.println("Smallest: " + smallest + ", Largest: " + largest);
    }

    // Using StringTokenizer
    static String findSmallestWordWithTokenizer(String input) {
        StringTokenizer tokenizer = new StringTokenizer(input);
        String smallestWord = tokenizer.nextToken();

        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            if (word.length() < smallestWord.length()) {
                smallestWord = word;
            }
        }

        return smallestWord;
    }

    static String findLargestWordWithTokenizer(String input) {
        StringTokenizer tokenizer = new StringTokenizer(input);
        String largestWord = tokenizer.nextToken();

        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            if (word.length() > largestWord.length()) {
                largestWord = word;
            }
        }

        return largestWord;
    }
}
