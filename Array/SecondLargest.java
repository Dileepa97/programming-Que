package Array;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println("Second Largest: " + secondLargest(arr));
        System.out.println("Second Largest: " + findSecondLargest(arr));

        int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println("Second Largest: " + findSecondLargestSorting(arr2));
    }

    // Using Loop
    public static int secondLargest(int[] arr) {
        int max = arr[0];
        int secondMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    static int findSecondLargest(int[] array) {
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num != firstLargest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }

    // Sorting the Array
    static int findSecondLargestSorting(int[] array) {
        Arrays.sort(array);
        return array[array.length - 2];
    }
}
