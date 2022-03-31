package com.java.problem.easy;

public class LikedListRemoveDuplicates {
    static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
        if (linkedList == null || linkedList.next == null) {
            return linkedList;
        }

        LinkedList curr = linkedList;
        while (curr != null && curr.next != null) {
            if(curr.value == curr.next.value) {
                curr.next = curr.next.next;
                continue;
            }
            curr = curr.next;
        }
        return linkedList;
    }
}
