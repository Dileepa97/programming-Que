package Array;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

/**
 * MinMax
 */
public class MinMax {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println("Largest: " + largest(arr));
        System.out.println("Smallest: " + smallest(arr));

        int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println("Largest: " + findMaxSorted(arr2));
        System.out.println("Smallest: " + findMinSorted(arr2));

        int[] arr3 = { 1, 2, 3, 4, 5, 6, 7, 8 };
        IntSummaryStatistics stats = findMinMaxWithStream(arr3);

        System.out.println("Largest: " + stats.getMax());
        System.out.println("Smallest: " + stats.getMin());
    }

    // Using a Loop
    public static int largest(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int smallest(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // Using Arrays.sort()
    static int findMinSorted(int[] array) {
        Arrays.sort(array);
        return array[0];
    }

    static int findMaxSorted(int[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }

    // Using IntStream
    static IntSummaryStatistics findMinMaxWithStream(int[] array) {
        return Arrays.stream(array).summaryStatistics();
    }
}