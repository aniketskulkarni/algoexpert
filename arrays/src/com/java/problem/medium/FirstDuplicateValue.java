package com.java.problem.medium;

public class FirstDuplicateValue {

    // Time: O(n) | Space: O(n)
    public int firstDuplicateValue(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int[] duplicates = new int[array.length];
        int loop = 0;
        while (loop < array.length) {
            int val = array[loop];
            if (duplicates[val - 1] != 0) {
                return val;
            }
            duplicates[val - 1] = duplicates[val - 1] + val;
            loop += 1;
        }
        return -1;
    }
}
