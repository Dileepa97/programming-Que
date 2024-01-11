package String;

public class StringReverse {
    public static void main(String[] args) {

        String str = "apple orange mango";

        System.out.println(reverse(str));
        System.out.println(reverseUsingCharArray(str));
        System.out.println(reverseUsingStringBuilder(str));
        System.out.println(reverseUsingStringConcatenation(str));
        System.out.println(reverseUsingRecursion(str));
        System.out.println(reverseUsingStringBuilderReverse(str));
        System.out.println(reverseUsingStack(str));
        System.out.println(reverseUsingIntStream(str));
        System.out.println(reverseUsingStringBuffer(str));
        System.out.println(reverseUsingXORSwap(str));
    }

    public static String reverse(String str) {
        int len = str.length();
        char[] charArray = str.toCharArray();
        for (int i = 0; i < len / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[len - 1 - i];
            charArray[len - 1 - i] = temp;
        }
        return new String(charArray);
    }

    // Using a char Array
    static String reverseUsingCharArray(String str) {
        char[] charArray = str.toCharArray();
        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            start++;
            end--;
        }

        return new String(charArray);
    }

    // Using StringBuilder
    static String reverseUsingStringBuilder(String str) {
        char[] charArray = str.toCharArray();
        StringBuilder reversed = new StringBuilder();

        for (int i = charArray.length - 1; i >= 0; i--) {
            reversed.append(charArray[i]);
        }

        return reversed.toString();
    }

    // Using String Concatenation
    static String reverseUsingStringConcatenation(String str) {
        char[] charArray = str.toCharArray();
        String reversed = "";

        for (int i = charArray.length - 1; i >= 0; i--) {
            reversed += charArray[i];
        }

        return reversed;
    }

    // Using Recursion
    static String reverseUsingRecursion(String str) {
        if (str.isEmpty()) {
            return str;
        }

        return reverseUsingRecursion(str.substring(1)) + str.charAt(0);
    }

    // Using String Builder and reverse()
    static String reverseUsingStringBuilderReverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    // Using Stack
    static String reverseUsingStack(String str) {
        char[] charArray = str.toCharArray();
        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (char c : charArray) {
            stack.push(c);
        }

        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = stack.pop();
        }

        return new String(charArray);
    }

    // Using IntStream
    static String reverseUsingIntStream(String str) {
        return java.util.stream.IntStream.range(0, str.length())
                .map(i -> str.charAt(str.length() - i - 1))
                .collect(java.lang.StringBuilder::new, java.lang.StringBuilder::appendCodePoint,
                        java.lang.StringBuilder::append)
                .toString();
    }

    // Using StringBuffer
    static String reverseUsingStringBuffer(String str) {
        return new java.lang.StringBuffer(str).reverse().toString();
    }

    // Using XOR Swap
    static String reverseUsingXORSwap(String str) {
        char[] charArray = str.toCharArray();
        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            charArray[start] ^= charArray[end];
            charArray[end] ^= charArray[start];
            charArray[start] ^= charArray[end];

            start++;
            end--;
        }

        return new String(charArray);
    }
}
