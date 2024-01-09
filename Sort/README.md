# Bubble Sort

<p align="center">
    <img src="https://content.codecademy.com/courses/sorting/BubbleSort.gif" width="500px"/>
</p>

Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. The pass through the list is repeated until the list is sorted.

## Algorithm

1. Start at the beginning of the list.
2. Compare the first two elements. If the first element is greater than the second, swap them.
3. Move to the next pair of elements and repeat step 2.
4. Continue this process until the end of the list is reached.
5. Repeat steps 1-4 until no more swaps are needed, indicating that the list is sorted.

## Complexity

The time **complexity** of the Bubble Sort algorithm is `O(n^2)` in the **worst and average cases**, where 'n' is the number of elements in the list. The **best-case** time complexity is `O(n)` when the list is already sorted.

The **space complexity** is `O(1)` as it only requires a constant amount of extra memory for the swapping of elements.

## Use Cases

Bubble Sort is a straightforward algorithm and is suitable for small datasets or nearly sorted datasets. However, due to its O(n^2) time complexity, it becomes inefficient for larger datasets. It is not commonly used in practice for large-scale sorting tasks.

Use Bubble Sort when:

- The dataset is small and efficiency is not a major concern.
- The list is almost sorted, as Bubble Sort performs well in this scenario.
- Simplicity of implementation is a priority.

Avoid Bubble Sort when:

- Efficiency is crucial, and the dataset is large.
- More sophisticated sorting algorithms with better time complexity are available (e.g., Merge Sort, QuickSort).

## Example

Consider the following array:

```plaintext
[5, 3, 9, 2, 8]
```

After the first pass, the array becomes:

```plaintext
[3, 5, 2, 8, 9]
```

After the second pass:

```plaintext
[3, 2, 5, 8, 9]
```

After the third pass:

```plaintext
[2, 3, 5, 8, 9]
```


