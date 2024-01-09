package Sort;

/**
 * BubbleSort - CTech Kitchen
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };

        System.out.println("Before sorting:");
        Sort.displayArr(arr);
        System.out.println();

        bubbleSort(arr);

        System.out.println("After sorting:");
        Sort.displayArr(arr);
        System.out.println();

        System.out.println("Optimized Bubble Sort =====================");

        int[] arr2 = { 5, 4, 3, 2, 1 };
        System.out.println("Before sorting:");
        Sort.displayArr(arr2);
        System.out.println();

        bubbleSortOptimized(arr2);

        System.out.println("After sorting:");
        Sort.displayArr(arr2);
    }

    static int[] bubbleSort(int arr[]) {
        int n = arr.length;
        int temp;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }

    static void bubbleSortOptimized(int[] arr) {
        int n = arr.length;
        boolean swapped;
        int temp;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped, the array is already sorted
            // Improves the efficiency of the algorithm for partially sorted or nearly
            // sorted arrays.
            if (!swapped) {
                break;
            }
        }
    }
}