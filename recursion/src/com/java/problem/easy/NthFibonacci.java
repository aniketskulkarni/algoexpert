package com.java.problem.easy;

public class NthFibonacci {

    // Time: O(2^n) | Space: O(n)
    public static int getNthFib(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return getNthFib(n - 1) + getNthFib(n - 2);
        }
    }

    // Time: O(n) | Space: O(1)
    public static int getNthFib1(int n) {
        int[] lastTwo = { 0, 1 };
        int cnt = 3;
        while (cnt <= n) {
            int next = lastTwo[0] + lastTwo[1];
            lastTwo[0] = lastTwo[1];
            lastTwo[1] = next;
            cnt++;
        }
        return n > 1 ? lastTwo[1] : lastTwo[0];
    }
}
