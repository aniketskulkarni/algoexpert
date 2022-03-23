package com.java.problem.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoNumbersSum {

    // time: O(n^2) | space: O(1)
    public static int[] twoNumberSum1(int[] array, int target) {
        if (array == null || array.length == 0) {
            return new int[0];
        }
        int[] result = new int[2];
        for (int outer = 0; outer < array.length - 1; outer++) {
            for (int inner = outer + 1; inner < array.length; inner++) {
                if (array[outer] + array[inner] == target) {
                    result[0] = array[outer];
                    result[1] = array[inner];
                    return result;
                }
            }
        }
        return new int[0];
    }

    // time: O(n^2) | space: O(1)
    public static int[] twoNumberSum2(int[] array, int target) {
        if (array == null || array.length == 0) {
            return new int[0];
        }

        for (int outer = 0; outer < array.length - 1; outer++) {
            int num1 = array[outer];
            for (int inner = outer + 1; inner < array.length; inner++) {
                int num2 = array[inner];
                if (num1 + num2 == target) {
                    return new int[] { num1, num2 };
                }
            }
        }
        return new int[0];
    }

    // time: O(n) | space: O(n)
    public static int[] twoNumberSum3(int[] array, int target) {
        if (array == null || array.length == 0) {
            return new int[0];
        }

        Set<Integer> nums = new HashSet<>();
        for (int n : array) {
            int match = target - n;
            if (nums.contains(match)) {
                return new int[] { match, n };
            } else {
                nums.add(n);
            }
        }
        return new int[0];
    }

    // time: O(nlog(n)) | space: O(1)
    public static int[] twoNumberSum4(int[] array, int target) {
        if (array == null || array.length == 0) {
            return new int[0];
        }

        Arrays.sort(array);

        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int sum = array[left] + array[right];
            if (sum == target) {
                return new int[] { array[left], array[right] };
            } else if (sum < target) {
                left += 1;
            } else if (sum > target) {
                right -= 1;
            }
        }
        return new int[0];
    }
}
