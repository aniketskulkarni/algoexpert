package com.java.problem.easy;

public class BubbleSort {

    // Best: O(n) time | O(1) space
    // Average: O(n^2) time | O(1) space
    // Worst: O(n^2) time | O(1) space
    // Every iteration big number will be placed at the end
    public static int[] bubbleSort(int[] array) {
        for (int outer = 0; outer < array.length; outer++) {
            for (int inner = 1; inner < array.length - outer; inner++) {
                if (array[inner - 1] > array[inner]) {
                    int temp = array[inner - 1];
                    array[inner - 1] = array[inner];
                    array[inner] = temp;
                }
            }
        }
        return array;
    }
}
