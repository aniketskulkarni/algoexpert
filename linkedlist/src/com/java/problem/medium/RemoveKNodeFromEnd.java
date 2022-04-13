package com.java.problem.medium;

public class RemoveKNodeFromEnd {

    // Time: O(n) : Space: O(1)
    public static void removeKthNodeFromEnd(LinkedList head, int k) {
        int len = 0;
        LinkedList curr = head;

        while (curr != null) {
            len += 1;
            curr = curr.next;
        }

        if (len == k) {
            head.value = head.next.value;
            head.next = head.next.next;
            return;
        }
        int nodePosToRemove = len - k;

        int currPos = 1;
        curr = head;

        while (curr != null && currPos != nodePosToRemove) {
            currPos += 1;
            curr = curr.next;
        }

        curr.next = curr.next.next;
    }

    public static void removeKthNodeFromEnd1(LinkedList head, int k) {
        int size = 0;
        LinkedList current = head;
        while (current != null) {
            size++;
            current = current.next;
        }

        if (k == size) {
            head.value = head.next.value;
            head.next = head.next.next;
            return;
        }

        int nodeToRemovePos = size - k;

        LinkedList before, after;
        before = after = null;
        current = head;

        for (int loop = 1; loop <= size; loop++) {
            if (loop == nodeToRemovePos)
                before = current;
            if (loop == nodeToRemovePos + 2)
                after = current;
            current = current.next;
        }
        before.next = after;
    }

    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }
}
