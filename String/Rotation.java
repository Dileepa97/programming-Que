package String;

public class Rotation {
    public static void main(String[] args) {

        String str1 = "ABCD";
        String str2 = "CDAB";

        System.out.println(areRotationsBruteForce(str1, str2));
        System.out.println(areRotationsConcatenation(str1, str2));
        System.out.println(areRotationsWithStringBuilder(str1, str2));

    }

    // Brute Force Approach
    static boolean areRotationsBruteForce(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            str1 = str1.substring(1) + str1.charAt(0);

            if (str1.equals(str2)) {
                return true;
            }
        }

        return false;
    }

    // Using Concatenation
    static boolean areRotationsConcatenation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        String concatenated = str1 + str1;

        return concatenated.contains(str2);
    }

    // Using StringBuilder
    static boolean areRotationsWithStringBuilder(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        StringBuilder rotated = new StringBuilder(str1);

        for (int i = 0; i < str1.length(); i++) {
            rotated.append(rotated.charAt(0)).deleteCharAt(0);

            if (rotated.toString().equals(str2)) {
                return true;
            }
        }

        return false;
    }

}
