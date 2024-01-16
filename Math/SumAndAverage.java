package Math;

import java.util.Arrays;

/**
 * SumAndAverage
 */
public class SumAndAverage {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println("Sum: " + findSumUsingLoop(arr));
        System.out.println("Average: " + findAverageUsingLoop(arr));

        int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println("Sum: " + findSumWithStream(arr2));
        System.out.println("Average: " + findAverageWithStream(arr2));
    }

    // Using Loop
    static int findSumUsingLoop(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    static double findAverageUsingLoop(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        return (double) findSumUsingLoop(array) / array.length;
    }

    // Using Streams
    static int findSumWithStream(int[] array) {
        return Arrays.stream(array).sum();
    }

    static double findAverageWithStream(int[] array) {
        if (array.length == 0) {
            return 0; // Avoid division by zero
        }

        return Arrays.stream(array).average().orElse(0);
    }
}