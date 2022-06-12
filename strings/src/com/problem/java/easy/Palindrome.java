package com.problem.java.easy;

public class Palindrome {

    // Time: O(n) | Space: O(1)
    public static boolean isPalindrome(String str) {
        int left, right;
        left = 0;
        right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
