# Selection Sort

<p align="center">
  <img src="https://codingconnect.net/wp-content/uploads/2016/09/Selection-Sort.gif" width="500"/>
</p>

Selection Sort is a simple sorting algorithm that sorts an array by repeatedly finding the minimum element from the unsorted part of the array and putting it at the beginning. The algorithm divides the array into a sorted and an unsorted region.

## Algorithm

1. Start with the entire array. Assume the first element is the minimum.
2. Iterate through the unsorted region to find the minimum element.
3. Swap the minimum element with the first element in the unsorted region.
4. Move the boundary between the sorted and unsorted regions to the right.
5. Repeat steps 1-4 until the entire array is sorted.

## Complexity

The **time complexity** of Selection Sort is `O(n^2)` in the **worst, average, and best cases**, where 'n' is the number of elements in the array. This is because, in each iteration, the algorithm needs to find the minimum element in the unsorted region, which takes O(n) time, and this process is repeated 'n' times.

The **space complexity** is `O(1)` as it only requires a constant amount of extra memory for the swapping of elements.

## Use Cases

Selection Sort is suitable for small datasets or arrays due to its simplicity. However, it is generally not the preferred choice for large-scale applications due to its O(n^2) time complexity. Use Selection Sort when:

- Memory usage is a concern, as it has a space complexity of O(1).
- The dataset is small, and simplicity of implementation is a priority.
- Swapping elements is expensive compared to comparisons (e.g., in certain embedded systems).

Avoid Selection Sort when:

- Efficiency is crucial, and the dataset is large.
- More sophisticated sorting algorithms with better time complexity are available (e.g., Merge Sort, QuickSort).

## Example

Consider the following array:

```plaintext
[5, 3, 9, 2, 8]
```
After the first pass, the array becomes:

```plaintext
[5, 3, 9, 2, 8]
```
After the second pass:

```plaintext
[5, 3, 9, 2, 8]
```
After the third pass:

```plaintext
[5, 3, 9, 2, 8]
```
After the fourth pass:

```plaintext
[5, 3, 9, 2, 8]
```

The array is now sorted.
