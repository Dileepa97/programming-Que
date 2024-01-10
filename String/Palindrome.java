package String;

public class Palindrome {
    public static void main(String[] args) {

        String str = "madam";
        System.out.println(isPalindrome(str));
        System.out.println(isPalindromeWithStringBuilder(str));
        System.out.println(isPalindromeWithPointers(str));
        System.out.println(isPalindromeRecursive(str));
    }

    public static boolean isPalindrome(String str) {
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    // Using String Builder
    static boolean isPalindromeWithStringBuilder(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    // Using two pointers
    static boolean isPalindromeWithPointers(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    // Using Recursion
    static boolean isPalindromeRecursive(String str) {
        if (str.length() <= 1) {
            return true;
        }

        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);

        if (firstChar != lastChar) {
            return false;
        }

        // Recursively check the substring without the first and last characters
        return isPalindromeRecursive(str.substring(1, str.length() - 1));
    }
}
