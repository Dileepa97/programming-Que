package Math;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestElement {
    public static void main(String[] args) {

        int[] nums = { 3, 2, 1, 5, 6, 4 };
        int k = 2;

        System.out.println(findKthLargestUsingSorting(nums, k));
        System.out.println(findKthLargestUsingQuickSelect(nums, k));
        System.out.println(findKthLargestUsingMaxHeap(nums, k));
    }

    // Using Sort
    // Time is O(nlog(n)) and space is O(1)
    static int findKthLargestUsingSorting(int[] array, int k) {
        Arrays.sort(array);
        return array[array.length - k];
    }

    // Using Quick Select Algorithm
    // O(n) time on average, O(log n) space on average.
    static int findKthLargestUsingQuickSelect(int[] array, int k) {
        int n = array.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int pivotIndex = partition(array, low, high);

            if (pivotIndex == n - k) {
                return array[pivotIndex];
            } else if (pivotIndex < n - k) {
                low = pivotIndex + 1;
            } else {
                high = pivotIndex - 1;
            }
        }

        return -1;
    }

    static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i + 1, high);
        return i + 1;
    }

    static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // Using Max Heap
    // O(n + k log n) time, O(n) space.
    static int findKthLargestUsingMaxHeap(int[] array, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        for (int num : array) {
            maxHeap.offer(num);
        }

        int result = 0;
        for (int i = 0; i < k; i++) {
            result = maxHeap.poll();
        }

        return result;
    }

}
