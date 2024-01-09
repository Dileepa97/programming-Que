package Sort.InsertionSort;

import Sort.Sort;

public class InsertionSort {
    public static void main(String[] args) {

        int[] arr = { 5, 4, 3, 2, 1 };

        System.out.println("Before sorting:");
        Sort.displayArr(arr);
        System.out.println();

        insertionSort(arr);

        System.out.println("After sorting:");
        Sort.displayArr(arr);
        System.out.println();

        System.out.println("Recursive Insertion Sort =====================");

        int[] arr2 = { 5, 4, 3, 2, 1 };
        System.out.println("Before sorting:");
        Sort.displayArr(arr2);
        System.out.println();

        insertionSortRecursive(arr2, arr2.length);

        System.out.println("After sorting:");
        Sort.displayArr(arr2);
    }

    static int[] insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j >= 0; j--) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                } else {
                    break;
                }
            }
        }
        return arr;
    }

    static void insertionSortRecursive(int[] arr, int n) {
        // Base case
        if (n <= 1) {
            return;
        }

        insertionSortRecursive(arr, n - 1);

        int lastElement = arr[n - 1];
        int j = n - 2;

        while (j >= 0 && arr[j] > lastElement) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }

        arr[j + 1] = lastElement;
    }
}
