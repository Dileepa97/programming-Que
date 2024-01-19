package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class DuplicateArray {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 2, 3, 4, 5, 6, 7, 7, 8 };
        findDuplicatesUsingLoop(arr);
        System.out.println();

        findDuplicatesUsingHashSet(arr);
        System.out.println();

        findDuplicatesUsingSorting(arr);
        System.out.println();

        findDuplicatesUsingHashMap(arr);
    }

    // Using Loop
    static void findDuplicatesUsingLoop(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Duplicate: " + array[i]);
                }
            }
        }
    }

    // Using HashSet
    static void findDuplicatesUsingHashSet(int[] array) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : array) {
            if (!set.add(num)) {
                duplicates.add(num);
            }
        }

        for (int duplicate : duplicates) {
            System.out.println("Duplicate: " + duplicate);
        }
    }

    // Using Sorting
    static void findDuplicatesUsingSorting(int[] array) {
        Arrays.sort(array);

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                System.out.println("Duplicate: " + array[i]);
            }
        }
    }

    // Using HashMap
    static void findDuplicatesUsingHashMap(int[] array) {
        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int num : array) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (int num : countMap.keySet()) {
            if (countMap.get(num) > 1) {
                System.out.println("Duplicate: " + num);
            }
        }
    }

}
