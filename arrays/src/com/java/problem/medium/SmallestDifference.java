package com.java.problem.medium;

import java.util.Arrays;

public class SmallestDifference {

    // Time: O(nlog(n) + mlog(m)) | Space: O(1)
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);

        int arrOneIdx, arrTwoIdx;
        arrOneIdx = arrTwoIdx = 0;

        int smallestDiff = Integer.MAX_VALUE;
        int[] result = new int[2];

        while (arrOneIdx < arrayOne.length && arrTwoIdx < arrayTwo.length) {
            int currDiff = 0;
            int firstNum = arrayOne[arrOneIdx];
            int secondNum = arrayTwo[arrTwoIdx];

            if (firstNum > secondNum) {
                currDiff = firstNum - secondNum;
                arrTwoIdx += 1;
            } else if (firstNum < secondNum) {
                currDiff = secondNum - firstNum;
                arrOneIdx += 1;
            } else {
                return new int[] { firstNum, secondNum };
            }

            if (smallestDiff > currDiff) {
                smallestDiff = currDiff;
                result = new int[] { firstNum, secondNum };
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arrayOne = new int[] { -1, 5, 10, 20, 28, 3 };
        int[] arrayTwo = new int[] { 26, 134, 135, 15, 17 };
        int[] result = smallestDifference(arrayOne, arrayTwo);
        for (int res : result) {
            System.out.print(res + " ");
        }
    }
}