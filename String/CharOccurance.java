package String;

public class CharOccurance {
    public static void main(String[] args) {

        String str = "Hardships often prepare ordinary people for an extraordinary destiny";
        countOccurrence(str, 'a');
    }

    public static void countOccurrence(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("Occurrence: " + count);
    }

}
