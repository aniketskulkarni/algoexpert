package com.java.problem.easy;

import java.util.List;

public class ValidateSubsequence {

    // Time: O(n) | Space: O(1)
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {

        if (array == null || sequence == null || array.size() < sequence.size()) {
            return false;
        }

        int loop, seqLoop;
        loop = seqLoop = 0;

        while (seqLoop < sequence.size() && loop != array.size()) {
            if (array.get(loop) == sequence.get(seqLoop)) {
                loop += 1;
                seqLoop += 1;
            } else {
                loop += 1;
            }
        }

        if (seqLoop == sequence.size()) {
            return true;
        }

        return false;
    }

    // Time: O(n) | Space: O(1) - improved vesrion
    public static boolean isValidSubsequence1(List<Integer> array, List<Integer> sequence) {

        if (array == null || sequence == null || array.size() < sequence.size()) {
            return false;
        }

        int arrIndex, seqIndex;
        arrIndex = seqIndex = 0;

        while (seqIndex < sequence.size() && arrIndex != array.size()) {
            if (array.get(arrIndex) == sequence.get(seqIndex)) {
                seqIndex += 1;
            }
            arrIndex += 1;
        }

        return seqIndex == sequence.size();
    }

    // Time: O(n) | Space: O(1) - improved vesrion
    public static boolean isValidSubsequence2(List<Integer> array, List<Integer> sequence) {

        if (array == null || sequence == null || array.size() < sequence.size()) {
            return false;
        }

        int seqIndex = 0;

        for (int val : array) {
            if (seqIndex == sequence.size()) {
                break;
            }

            if (sequence.get(seqIndex) == val) {
                seqIndex += 1;
            }
        }

        return seqIndex == sequence.size();
    }
}
