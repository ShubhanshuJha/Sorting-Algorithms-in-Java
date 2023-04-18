# Sorting Algorithms in Java
This repository contains Java code for various sorting algorithms, including:
* Bubble Sort
* Selection Sort
* Insertion Sort
* Merge Sort
* Quick Sort

Each sorting algorithm is implemented as a separate method in the Sorting class. The code is commented and easy to read, making it an ideal resource for students learning about sorting algorithms in Java.

---
### How to use

To use the code in this repository, simply copy the Sorting.java file into your Java project and import the Sorting class. Then, you can call any of the sorting algorithms by following these steps:
1. <b>Instantiate the Sorting class:</b>

```Sorting s = new Sorting();```

2. Define an integer array `arr` of size `n` with the values you want to sort.

3. Call the desired sorting method on the Sorting instance with the arr array and the appropriate arguments:
```
s.mergeSort(arr, 0, n - 1);
s.quickSort(arr, 0, n - 1);
s.bubbleSort(arr, n);
s.selectionSort(arr, n);
s.insertionSort(arr, n);
```
* mergeSort: takes the array arr, the start index 0, and the end index n-1.
* quickSort: takes the array arr, the start index 0, and the end index n-1.
* bubbleSort: takes the array arr and its size n.
* selectionSort: takes the array arr and its size n.
* insertionSort: takes the array arr and its size n.

4. The array `arr` will now be sorted in ascending order according to the chosen sorting algorithm.
---

### Usage Example
***Code***:
  ```
  public static void main(String[] args) {
      Sorting s = new Sorting();
      int[] arr = {3, 7, 1, 9, 4};
      int n = arr.length;

      // Sort the array using merge sort
      s.mergeSort(arr, 0, n-1);

      // Print the sorted array
      for (int i = 0; i < n; i++) {
          System.out.print(arr[i] + " ");
      }
  }
 ```

***Output***:
```
1 3 4 7 9
```


