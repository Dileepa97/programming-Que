package String;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitString {
    public static void main(String[] args) {

        String str = "apple orange mango";

        String[] result = customSplit(str, ' ');
        for (String s : result) {
            System.out.println(s);
        }

        System.out.println();

        customSplitUsingLoop(str);
        System.out.println();

        customSplitUsingIndex(str);
        System.out.println();

        customSplitUsingStringTokenizer(str);
        System.out.println();

        String[] result1 = splitUsingSplitMethod(str);
        for (String s : result1) {
            System.out.println(s);
        }

        System.out.println();

        String[] result2 = splitUsingPatternAndMatcher(str);
        for (String s : result2) {
            System.out.println(s);
        }
    }

    public static String[] customSplit(String str, char ch) {
        int len = str.length();
        int count = 1;

        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        String[] result = new String[count];
        int k = 0;
        int start = 0;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ch) {
                result[k++] = str.substring(start, i);
                start = i + 1;
            }
        }

        result[k] = str.substring(start, len);

        return result;
    }

    // Using a Loop
    static void customSplitUsingLoop(String str) {
        char[] charArray = str.toCharArray();
        StringBuilder word = new StringBuilder();

        for (char c : charArray) {
            if (c != ' ') {
                word.append(c);
            } else {
                System.out.println(word.toString());
                word.setLength(0);
            }
        }

        if (word.length() > 0) {
            System.out.println(word.toString());
        }
    }

    // Using Index Manipulation
    static void customSplitUsingIndex(String str) {
        int start = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                System.out.println(str.substring(start, i));
                start = i + 1;
            }
        }

        if (start < str.length()) {
            System.out.println(str.substring(start));
        }
    }

    // Using StringTokenizer
    static void customSplitUsingStringTokenizer(String str) {
        StringTokenizer tokenizer = new StringTokenizer(str, " ");

        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }

    // Using split() method
    static String[] splitUsingSplitMethod(String str) {
        return str.split(" ");
    }

    // Using Pattern and Matcher
    static String[] splitUsingPatternAndMatcher(String str) {
        Pattern pattern = Pattern.compile("\\s");
        Matcher matcher = pattern.matcher(str);
        int count = 1;

        while (matcher.find()) {
            count++;
        }

        String[] result = new String[count];
        matcher.reset();

        int i = 0;
        int start = 0;

        while (matcher.find()) {
            result[i++] = str.substring(start, matcher.start());
            start = matcher.end();
        }

        result[i] = str.substring(start);

        return result;
    }
}
