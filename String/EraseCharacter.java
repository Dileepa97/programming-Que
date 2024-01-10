package String;

/**
 * EraseCharacter - CTech Kitchen, Java
 */
public class EraseCharacter {

    public static void main(String[] args) {

        String str = "Hello World";
        char ch = 'l';

        System.out.println(removeCharacter(str, ch));
        System.out.println(removeCharacterWithStringBuilder(str, ch));
        System.out.println(removeCharacterWithStringBuilder2(str, ch));
        System.out.println(removeCharacterWithReplaceAll(str, ch));
        System.out.println(removeCharacterWithCharArray(str, ch));
        System.out.println(removeCharacterWithCharArray2(str, ch));
    }

    static String removeCharacter(String str, char ch) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                result += str.charAt(i);
            }
        }
        return result;
    }

    // Using String Builder
    static String removeCharacterWithStringBuilder(String str, char charToRemove) {
        StringBuilder stringBuilder = new StringBuilder(str);

        for (int i = 0; i < stringBuilder.length();) {
            if (stringBuilder.charAt(i) == charToRemove) {
                stringBuilder.deleteCharAt(i);
            } else {
                i++;
            }
        }

        return stringBuilder.toString();
    }

    public static String removeCharacterWithStringBuilder2(String str, char ch) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    // Using String Replace All
    static String removeCharacterWithReplaceAll(String str, char charToRemove) {
        String regex = String.valueOf(charToRemove);
        return str.replaceAll(regex, "");
    }

    // Using char array
    static String removeCharacterWithCharArray(String str, char charToRemove) {
        char[] charArray = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        for (char c : charArray) {
            if (c != charToRemove) {
                stringBuilder.append(c);
            }
        }

        return stringBuilder.toString();
    }

    public static String removeCharacterWithCharArray2(String str, char ch) {
        char[] charArray = str.toCharArray();
        int len = charArray.length;
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (charArray[i] != ch) {
                charArray[count++] = charArray[i];
            }
        }
        return new String(charArray, 0, count);
    }
}