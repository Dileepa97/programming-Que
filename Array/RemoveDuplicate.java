package Array;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 2, 3, 4, 5, 6, 7, 7, 8 };
        System.out.println(Arrays.toString(removeDuplicatesUsingLoop(arr)));

        int[] arr2 = { 1, 2, 2, 3, 4, 5, 6, 7, 7, 8 };
        System.out.println(Arrays.toString(removeDuplicate(arr2)));

        int[] arr3 = { 1, 2, 2, 3, 4, 5, 6, 7, 7, 8 };
        System.out.println(Arrays.toString(removeDuplicates(arr3)));

        int[] arr4 = { 1, 2, 2, 3, 4, 5, 6, 7, 7, 8 };
        System.out.println(Arrays.toString(removeDuplicatesUsingHashSet(arr4)));
    }

    // Using Loop
    static int[] removeDuplicatesUsingLoop(int[] array) {
        int length = array.length;

        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i] == array[j]) {
                    // Shift elements to the left to remove the duplicate
                    for (int k = j; k < length - 1; k++) {
                        array[k] = array[k + 1];
                    }
                    length--;
                    j--;
                }
            }
        }

        int[] uniqueArray = Arrays.copyOf(array, length);

        return uniqueArray;
    }

    static int[] removeDuplicate(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = arr[len - 1];
                    len--;
                    j--;
                }
            }
        }

        int[] uniqueArray = Arrays.copyOf(arr, len);

        return uniqueArray;
    }

    public static int[] removeDuplicates(int[] arr) {
        int len = arr.length;
        int[] result = new int[len];
        int k = 0;

        for (int i = 0; i < len; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < len; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                result[k++] = arr[i];
            }
        }
        return Arrays.copyOf(result, k);
    }

    // Using HashSet
    static int[] removeDuplicatesUsingHashSet(int[] array) {
        HashSet<Integer> set = new HashSet<>();
        int length = array.length;

        for (int i = 0; i < length; i++) {
            if (!set.add(array[i])) {
                // If element is already present, remove it
                for (int j = i; j < length - 1; j++) {
                    array[j] = array[j + 1];
                }
                length--;
                i--;
            }
        }

        int[] uniqueArray = new int[length];
        System.arraycopy(array, 0, uniqueArray, 0, length);

        return uniqueArray;
    }

}
