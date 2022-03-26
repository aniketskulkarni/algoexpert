package com.java.problem.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum {

    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {

        if (array == null || array.length == 0) {
            return new ArrayList<Integer[]>();
        }

        List<Integer[]> threeNumSum = new ArrayList<>();

        Arrays.sort(array);

        for (int outerLoop = 0; outerLoop < array.length; outerLoop++) {
            int left = outerLoop + 1;
            int right = array.length - 1;
            while (left < right) {
                int sum = array[outerLoop] + array[left] + array[right];
                if (sum == targetSum) {
                    Integer[] result = new Integer[] { array[outerLoop], array[left], array[right] };
                    threeNumSum.add(result);
                    left += 1;
                    right -= 1;
                } else if (sum > targetSum) {
                    right -= 1;
                } else if (sum < targetSum) {
                    left += 1;
                }
            }
        }

        return threeNumSum;
    }
}
