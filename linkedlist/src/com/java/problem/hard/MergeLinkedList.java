package com.java.problem.hard;

public class MergeLinkedList {

    public static class LinkedList {
        int value;
        LinkedList next;

        LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    // Time: O(n) | Space: O(1)
    public static LinkedList mergeLinkedLists(LinkedList headOne, LinkedList headTwo) {
        LinkedList h1 = headOne;
        LinkedList h2 = headTwo;
        LinkedList h1Prev = null;
        while (h1 != null && h2 != null) {
            if (h1.value < h2.value) {
                h1Prev = h1;
                h1 = h1.next;
            } else {
                if (h1Prev != null) {
                    h1Prev.next = h2;
                }
                h1Prev = h2;
                h2 = h2.next;
                h1Prev.next = h1;
            }
        }
        if (h1 == null) {
            h1Prev.next = h2;
        }
        return headOne.value < headTwo.value ? headOne : headTwo;
    }
}
