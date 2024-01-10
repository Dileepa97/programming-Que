package String;

/**
 * StringToInt
 */
public class StringToInt {

    public static void main(String[] args) {

        String text = "123";

        System.out.println(parseInt(text));
        System.out.println(stringToIntUsingAsciiValues(text));
        System.out.println(stringToIntUsingValueOf(text));
    }

    static int parseInt(String text) {

        int sum = 0;

        for (int i = 0; i <= text.length() - 1; i++) {
            char c = text.charAt(i);

            int start = (int) '0';
            int end = (int) c;
            int cNumber = end - start;

            int value = (int) (cNumber * Math.pow(10, (text.length() - 1 - i)));
            sum += value;
        }

        return sum;
    }

    // Using ASCII Values
    static int stringToIntUsingAsciiValues(String str) {
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            char digit = str.charAt(i);

            if (digit >= '0' && digit <= '9') {
                result = result * 10 + (digit - '0');
            } else {

                throw new IllegalArgumentException("Invalid character in the string: " + digit);
            }
        }

        return result;
    }

    // Using existing methods
    static int stringToIntUsingValueOf(String str) {
        return Integer.valueOf(str);
    }

}