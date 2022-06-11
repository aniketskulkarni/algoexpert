package com.java.problem.easy;

public class FindThreeLargestNumbers {

    // Time: O(n) | Space: O(1)
    public static int[] findThreeLargestNumbers(int[] array) {
        int[] output = { Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE };
        for (int num : array) {
            addLargestNumber(output, num);
        }
        return output;
    }

    static void addLargestNumber(int[] output, int num) {
        if (num > output[2]) {
            output[0] = output[1];
            output[1] = output[2];
            output[2] = num;
        } else if (num > output[1]) {
            output[0] = output[1];
            output[1] = num;
        } else if (num > output[0]) {
            output[0] = num;
        }
    }

    // Time: O(n) | Space: O(1)
    public static int[] findThreeLargestNumbers1(int[] array) {
        int[] output = { Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE };
        for (int num : array) {
            addLargestNumber(output, num);
        }
        return output;
    }

    static void shiftNumbers(int[] output, int num, int idx) {
        for (int i = 0; i <= idx; i++) {
            if (i == idx) {
                output[i] = num;
            } else {
                output[i] = output[i + 1];
            }
        }
    }
}
