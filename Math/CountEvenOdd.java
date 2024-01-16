package Math;

import java.util.Arrays;

public class CountEvenOdd {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] result = countEvenOddNumbers(arr);
        System.out.println("Even: " + result[0] + " Odd: " + result[1]);

        int[] result2 = countEvenOddNumbersWithStream(arr);
        System.out.println("Even: " + result2[0] + " Odd: " + result2[1]);
    }

    // Using Loop
    static int[] countEvenOddNumbers(int[] array) {
        int evenCount = 0;
        int oddCount = 0;

        for (int num : array) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        return new int[] { evenCount, oddCount };
    }

    // Using Stream
    static int[] countEvenOddNumbersWithStream(int[] array) {
        int evenCount = (int) Arrays.stream(array).filter(num -> num % 2 == 0).count();
        int oddCount = (int) Arrays.stream(array).filter(num -> num % 2 != 0).count();

        return new int[] { evenCount, oddCount };
    }

}
