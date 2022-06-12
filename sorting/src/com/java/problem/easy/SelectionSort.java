package com.java.problem.easy;

public class SelectionSort {

    // Best: O(n^2) time | O(1) space
    // Average: O(n^2) time | O(1) space
    // Worst: O(n^2) time | O(1) space
    // Two lists - Sorted and Unsorted
    // At every iteration find the smallest number and add it to sorted list
    public static int[] selectionSort(int[] array) {
        int startIdx = 0;
        while (startIdx < array.length - 1) {
            int smallIdx = startIdx;
            for (int i = startIdx + 1; i < array.length; i++) {
                if (array[smallIdx] > array[i]) {
                    smallIdx = i;
                }
            }
            int temp = array[smallIdx];
            array[smallIdx] = array[startIdx];
            array[startIdx] = temp;

            startIdx++;
        }
        return array;
    }
}
