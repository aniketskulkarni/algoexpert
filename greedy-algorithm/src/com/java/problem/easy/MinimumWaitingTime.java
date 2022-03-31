package com.java.problem.easy;

import java.util.Arrays;

public class MinimumWaitingTime {

    // Time: O(n^2) | Space: O(1)
    public int minimumWaitingTime(int[] queries) {
        if (queries == null || queries.length == 0) {
            return -1;
        }

        Arrays.sort(queries);

        int minWaitTime = 0;
        for (int outer = 1; outer < queries.length; outer++) {
            int waitTime = 0;
            for (int inner = 0; inner < outer; inner++) {
                waitTime += queries[inner];
            }
            minWaitTime += waitTime;
        }

        return minWaitTime;
    }
}
