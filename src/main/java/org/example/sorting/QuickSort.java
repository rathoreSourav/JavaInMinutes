package org.example.sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {3, 6, 8, 10, 1, 2, 1};
        quicksort(arr, 0, arr.length - 1);

        // Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            // Step 1: Partition the array and get the pivot index
            int pivotIndex = partition(arr, low, high);

            // Step 2: Recursively sort the sub-arrays
            quicksort(arr, low, pivotIndex - 1);    // Sort the left sub-array
            quicksort(arr, pivotIndex + 1, high);   // Sort the right sub-array
        }
    }

    public static int partition(int[] arr, int low, int high) {
        // Step 1: Choose the pivot element (here, we choose the last element)
        int pivot = arr[high];
        int i = low - 1;

        // Step 2: Iterate through the array and rearrange elements based on the pivot
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Step 3: Swap the pivot element with the element at arr[i+1] to place the pivot in its correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // Step 4: Return the pivot index
        return i + 1;
    }
}