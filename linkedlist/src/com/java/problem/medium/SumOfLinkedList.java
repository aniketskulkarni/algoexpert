package com.java.problem.medium;

public class SumOfLinkedList {
    static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    // Time: O(max(n,m)) | Space: O(max(n,m))
    public LinkedList sumOfLinkedLists(LinkedList linkedListOne, LinkedList linkedListTwo) {
        LinkedList ansList = new LinkedList(0);
        LinkedList sumList = ansList;
        int carry = 0;
        while (linkedListOne != null && linkedListTwo != null) {
            int addition = linkedListOne.value + linkedListTwo.value + carry;
            if (addition > 9) {
                carry = addition / 10;
                addition = addition % 10;
            } else {
                carry = 0;
            }
            sumList.next = new LinkedList(addition);
            sumList = sumList.next;

            linkedListOne = linkedListOne.next;
            linkedListTwo = linkedListTwo.next;
        }

        while (linkedListOne != null) {
            int addition = linkedListOne.value + carry;
            if (addition > 9) {
                carry = addition / 10;
                addition = addition % 10;
            } else {
                carry = 0;
            }
            sumList.next = new LinkedList(addition);
            sumList = sumList.next;

            linkedListOne = linkedListOne.next;
        }

        while (linkedListTwo != null) {
            int addition = linkedListTwo.value + carry;
            if (addition > 9) {
                carry = addition / 10;
                addition = addition % 10;
            } else {
                carry = 0;
            }
            sumList.next = new LinkedList(addition);
            sumList = sumList.next;

            linkedListTwo = linkedListTwo.next;
        }

        if (carry > 0) {
            sumList.next = new LinkedList(carry);
            sumList = sumList.next;
        }
        return ansList.next;
    }
}
