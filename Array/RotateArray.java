package Array;

public class RotateArray {
    public static void main(String[] args) {

        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;

        rotateUsingIntermediateArray(nums, k);

        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();

        int[] nums2 = { 1, 2, 3, 4, 5, 6, 7 };
        int k2 = 3;

        rotateUsingBubbleRotate(nums2, k2);

        for (int i : nums2) {
            System.out.print(i + " ");
        }
        System.out.println();

        int[] nums3 = { 1, 2, 3, 4, 5, 6, 7 };
        int k3 = 3;

        rotateUsingReverse(nums3, k3);

        for (int i : nums3) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    // Using Intermediate Array
    // Space complexity is O(n) and time complexity is O(n)
    static int[] rotateUsingIntermediateArray(int[] nums, int k) {
        if (k > nums.length)
            k = k % nums.length;

        int[] result = new int[nums.length];

        for (int i = 0; i < k; i++) {
            result[i] = nums[nums.length - k + i];
        }

        int j = 0;

        for (int i = k; i < nums.length; i++) {
            result[i] = nums[j];
            j++;
        }

        System.arraycopy(result, 0, nums, 0, nums.length);

        return nums;
    }

    // Using Bubble Rotate
    // Space complexity is O(1) and time complexity is O(n*k)

    // example (length=7, order=3)
    // i=0
    // 0 1 2 3 4 5 6
    // 0 1 2 3 4 6 5
    // ...
    // 6 0 1 2 3 4 5
    // i=1
    // 6 0 1 2 3 5 4
    // ...
    // 5 6 0 1 2 3 4
    // i=2
    // 5 6 0 1 2 4 3
    // ...
    // 4 5 6 0 1 2 3
    static int[] rotateUsingBubbleRotate(int[] arr, int k) {
        if (arr == null || k < 0) {
            throw new IllegalArgumentException("Illegal argument!");
        }

        for (int i = 0; i < k; i++) {
            for (int j = arr.length - 1; j > 0; j--) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
        }

        return arr;
    }

    // Using Reversal
    // Space complexity is O(1) and time complexity is O(1)

    // example (length=6, order=2)
    // 1. Divide the array two parts: 1,2,3,4 and 5, 6
    // 2. Reverse first part: 4,3,2,1,5,6
    // 3. Reverse second part: 4,3,2,1,6,5
    // 4. Reverse the whole array: 5,6,1,2,3,4
    static int[] rotateUsingReverse(int[] arr, int k) {
        if (arr == null || arr.length == 0 || k < 0) {
            throw new IllegalArgumentException("Illegal argument!");
        }

        if (k > arr.length) {
            k = k % arr.length;
        }

        // length of first part
        int a = arr.length - k;
        reverse(arr, 0, a - 1);
        reverse(arr, a, arr.length - 1);
        reverse(arr, 0, arr.length - 1);

        return arr;
    }

    static void reverse(int[] arr, int left, int right) {
        if (arr == null || arr.length == 1)
            return;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

}
