package String;

public class IntToString {
    public static void main(String[] args) {

        int num = -123;

        System.out.println(intToStringBuilder(num));
        System.out.println(intToStringUsingValueOf(num));
        System.out.println(intToStringUsingStringFormat(num));
        System.out.println(intToStringUsingStringBuilder(num));
        System.out.println(intToStringConcatenation(num));
    }

    // Using String Builder
    static String intToStringBuilder(int num) {
        char[] digits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

        if (num == 0) {
            return "0";
        }

        StringBuilder stringBuilder = new StringBuilder();
        boolean isNegative = num < 0;
        num = Math.abs(num);

        while (num > 0) {
            int digit = num % 10;
            stringBuilder.insert(0, digits[digit]);
            num /= 10;
        }

        if (isNegative) {
            stringBuilder.insert(0, '-');
        }

        return stringBuilder.toString();
    }

    // Using existing methods
    static String intToStringUsingValueOf(int num) {
        return String.valueOf(num);
    }

    static String intToStringUsingStringFormat(int num) {
        return String.format("%d", num);
    }

    static String intToStringUsingStringBuilder(int num) {
        return new StringBuilder().append(num).toString();
    }

    static String intToStringConcatenation(int num) {
        return "" + num;
    }

}
