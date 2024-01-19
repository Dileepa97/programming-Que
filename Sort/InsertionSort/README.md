# Insertion Sort

<p align="center">
  <img src="https://miro.medium.com/v2/resize:fit:640/format:webp/1*JP-wURjwf4k23U2G3GNQDw.gif" width="500px"/>
</p>
Insertion Sort is a simple sorting algorithm that builds the final sorted array one element at a time. It is much less efficient on large lists than more advanced algorithms such as QuickSort, MergeSort, or HeapSort, but it performs well for small datasets or partially sorted datasets.

## Algorithm

1. Start with the second element (assuming the first element is already sorted).
2. Compare the current element with its adjacent element(s) in the sorted region.
3. Move elements greater than the current element to the right to make space.
4. Insert the current element into the correct position in the sorted region.
5. Repeat steps 1-4 until the entire array is sorted.

## Complexity

The time **complexity of Insertion** Sort is `O(n^2)` in the **worst and average cases**, where 'n' is the number of elements in the array. The **best-case** time complexity is `O(n)` when the array is already sorted.

The **space complexity** is `O(1)` as it only requires a constant amount of extra memory for the swapping of elements.

## Use Cases

Insertion Sort is suitable for small datasets or partially sorted datasets due to its simplicity and efficiency for almost-sorted data. Use Insertion Sort when:

- The dataset is small, and simplicity of implementation is a priority.
- The dataset is nearly sorted or already partially sorted.
- The input array is short and random access time is costly (e.g., in linked lists).

Avoid Insertion Sort when:

- Efficiency is crucial, and the dataset is large.
- More sophisticated sorting algorithms with better time complexity are available (e.g., Merge Sort, QuickSort).

## Example

Consider the following array:

```plaintext
[5, 3, 9, 2, 8]
```
After the first pass, the array becomes:

```plaintext
[3, 5, 9, 2, 8]
```
After the second pass:

```plaintext
[3, 5, 9, 2, 8]
```
After the third pass:

```plaintext
[2, 3, 5, 9, 8]
```
After the fourth pass:

```plaintext
[2, 3, 5, 8, 9]
```
The array is now sorted.

