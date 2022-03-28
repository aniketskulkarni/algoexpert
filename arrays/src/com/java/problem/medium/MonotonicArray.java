package com.java.problem.medium;

public class MonotonicArray {

    public static boolean isMonotonic(int[] array) {
        if (array == null || array.length == 0 || array.length == 1) {
            return true;
        }

        int index = 0;

        if (array[index] <= array[index + 1] && array[index] > -1) {
            return increasingOrder(array);
        }

        return decreasingOrder(array);
    }

    private static boolean increasingOrder(int[] array) {
        for (int index = 0; index < array.length - 1; index++) {
            if (array[index] > array[index + 1]) {
                return false;
            }
        }
        return true;
    }

    private static boolean decreasingOrder(int[] array) {
        for (int index = 0; index < array.length - 1; index++) {
            if (array[index] < array[index + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isMonotonic(new int[] { -1, -5, -10, -1100, -1100, -1101, -1102, -9001 }));
        System.out.println(isMonotonic(new int[] { 1, 1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 8, 9, 10, 11 }));
    }
}
