package com.java.problem.medium;

public class LongestPeak {

    // Time: O(n) | Space: O(1)
    public static int longestPeak(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int longestPeakLen = 0;
        int loop = 1;
        while (loop < array.length - 1) {
            boolean isPeak = array[loop - 1] < array[loop] && array[loop] > array[loop + 1];
            if (!isPeak) {
                loop += 1;
                continue;
            }

            int currPeakLen = 3;

            int leftIdx = loop - 2;
            while (leftIdx >= 0 && array[leftIdx] < array[leftIdx + 1]) {
                leftIdx -= 1;
                currPeakLen += 1;
            }

            int rightIdx = loop + 2;
            while (rightIdx < array.length && array[rightIdx] < array[rightIdx - 1]) {
                rightIdx += 1;
                currPeakLen += 1;
            }

            if (currPeakLen > longestPeakLen) {
                longestPeakLen = currPeakLen;
            }
            loop = rightIdx;
        }
        return longestPeakLen;
    }

    public static void main(String[] args) {
        int longestPeak = longestPeak(new int[] { 1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3 });
        System.out.println(longestPeak);
    }
}
