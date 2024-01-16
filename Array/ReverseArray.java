package Array;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        reverse(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8 };
        reverseArrayUsingLoop(arr2);
        System.out.println(Arrays.toString(arr2));

        Integer[] arr3 = { 1, 2, 3, 4, 5, 6, 7, 8 };
        reverseArrayUsingCollections(arr3);
        System.out.println(Arrays.toString(arr3));
    }

    // Using Loop
    public static void reverse(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[len - 1 - i];
            arr[len - 1 - i] = temp;
        }
    }

    static void reverseArrayUsingLoop(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
    }

    // Using Collections.reverse()
    static void reverseArrayUsingCollections(Integer[] array) {
        Collections.reverse(Arrays.asList(array));
    }

}
