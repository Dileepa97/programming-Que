package Sort.SelectionSort;

import Sort.Sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };

        System.out.println("Before sorting:");
        Sort.displayArr(arr);
        System.out.println();

        selectionSort(arr);

        System.out.println("After sorting:");
        Sort.displayArr(arr);
        System.out.println();

        System.out.println("Recursive Selection Sort =====================");

        int[] arr2 = { 5, 4, 3, 2, 1 };
        System.out.println("Before sorting:");
        Sort.displayArr(arr2);
        System.out.println();

        selectionSort(arr2, 0);

        System.out.println("After sorting:");
        Sort.displayArr(arr2);
    }

    static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Recursive version
    static void selectionSort(int[] arr, int startIndex) {
        int n = arr.length;

        // Base case
        if (startIndex >= n - 1) {
            return;
        }

        int minIndex = startIndex;
        for (int j = startIndex + 1; j < n; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }

        int temp = arr[minIndex];
        arr[minIndex] = arr[startIndex];
        arr[startIndex] = temp;

        selectionSort(arr, startIndex + 1);
    }
}
