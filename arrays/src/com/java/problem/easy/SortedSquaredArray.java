package com.java.problem.easy;

import java.util.Arrays;

public class SortedSquaredArray {

    // Time: O(nlong(n)) | Space: O(n)
    public int[] sortedSquaredArray(int[] array) {
        if (array == null || array.length == 0) {
            return new int[] {};
        }

        int[] result = new int[array.length];

        for (int index = 0; index < array.length; index++) {
            result[index] = array[index] * array[index];
        }

        Arrays.sort(result);

        return result;
    }

    // Time: O(n) | Space: O(n)
    public int[] sortedSquaredArray1(int[] array) {
        if (array == null || array.length == 0) {
            return new int[] {};
        }

        int[] sortedSquares = new int[array.length];
        int minIndex = 0;
        int maxIndex = array.length - 1;

        for (int index = array.length - 1; index >= 0; index--) {
            int min = array[minIndex];
            int max = array[maxIndex];
            if (Math.abs(min) > Math.abs(max)) {
                sortedSquares[index] = min * min;
                minIndex += 1;
            } else {
                sortedSquares[index] = max * max;
                maxIndex -= 1;
            }
        }

        return sortedSquares;
    }
}
