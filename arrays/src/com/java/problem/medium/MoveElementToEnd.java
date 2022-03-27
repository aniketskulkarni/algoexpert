package com.java.problem.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveElementToEnd {

    // Time: O(n) | Space: O(1)
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        if (array == null || array.size() == 0) {
            return new ArrayList<>();
        }

        int right = array.size() - 1;
        int left = 0;

        while (left < right) {
            if (array.get(left) == toMove) {
                int temp = array.get(right);
                array.set(right, toMove);
                array.set(left, temp);
                right -= 1;
            } else {
                left += 1;
            }
        }
        return array;
    }

    // Time: O(n) | Space: O(1) | Using Array as input
    public static int[] moveElementToEnd1(int[] array, int toMove) {
        if (array == null || array.length == 0) {
            return new int[0];
        }

        int right = array.length - 1;
        int left = 0;

        while (left < right) {
            if (array[left] == toMove) {
                int temp = array[right];
                array[right] = toMove;
                array[left] = temp;
                right -= 1;
            } else {
                left += 1;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        List<Integer> result = moveElementToEnd(Arrays.asList(2, 1, 2, 2, 2, 3, 4, 2), 2);
        for (int res : result) {
            System.out.print(res + " ");
        }

        System.out.println();
        
        int[] result1 = moveElementToEnd1(new int[] { 2, 1, 2, 2, 2, 3, 4, 2 }, 2);
        for (int res : result1) {
            System.out.print(res + " ");
        }
    }
}
