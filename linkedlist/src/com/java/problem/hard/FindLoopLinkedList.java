package com.java.problem.hard;

public class FindLoopLinkedList {

    // Time: O(n) | Space: O(1)
    public static LinkedList findLoop(LinkedList head) {
        if (head == null || head.next == null) {
            return null;
        }

        LinkedList slow = head.next;
        LinkedList fast = head.next.next;
        boolean hasCycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                hasCycle = true;
                break;
            }
        }

        if (hasCycle) {
            fast = head;
            while (fast != null && slow != null) {
                if (fast == slow) {
                    return fast;
                }
                slow = slow.next;
                fast = fast.next.next;
            }
        }
        return null;
    }

    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }
}
