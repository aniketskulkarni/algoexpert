package com.java.problem.easy;

public class BinarySearch {

    // Time: O(log(n)) | Space: O(1)
    public static int binarySearch(int[] array, int target) {
        int l = 0;
        int r = array.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (target < array[mid]) {
                r = mid - 1;
            } else if (target > array[mid]) {
                l = mid + 1;
            }
        }
        return -1;
    }
}
