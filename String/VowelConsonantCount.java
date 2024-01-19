package String;

public class VowelConsonantCount {
    public static void main(String[] args) {

        String str = "Hardships often prepare ordinary people for an extraordinary destiny";
        countVowelAndConsonant(str);
    }

    public static void countVowelAndConsonant(String str) {
        int vowel = 0;
        int consonant = 0;

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                vowel++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonant++;
            }
        }
        System.out.println("Vowel: " + vowel + ", Consonant: " + consonant);
    }
}
