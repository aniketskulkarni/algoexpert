package com.java.problem.medium;

public class LinkedListConstruction {

    static class DoublyLinkedList {
        public Node head;
        public Node tail;

        public void setHead(Node node) {
            if (head == null) {
                head = node;
                tail = node;
                return;
            }
            insertBefore(head, node);
        }

        public void setTail(Node node) {
            if (tail == null) {
                setHead(node);
                return;
            }
            insertAfter(tail, node);
        }

        public void insertBefore(Node node, Node nodeToInsert) {
            if (nodeToInsert == head && nodeToInsert == tail) {
                return;
            }

            remove(nodeToInsert);
            nodeToInsert.prev = node.prev;
            nodeToInsert.next = node;

            if (node.prev == null) {
                head = nodeToInsert;
            } else {
                node.prev.next = nodeToInsert;
            }
            node.prev = nodeToInsert;
        }

        public void insertAfter(Node node, Node nodeToInsert) {
            if (nodeToInsert == head && nodeToInsert == tail) {
                return;
            }

            remove(nodeToInsert);
            nodeToInsert.prev = node;
            nodeToInsert.next = node.next;

            if (node.next == null) {
                tail = nodeToInsert;
            } else {
                node.next.prev = nodeToInsert;
            }
            node.next = nodeToInsert;
        }

        public void insertAtPosition(int position, Node nodeToInsert) {
            if (position == 1) {
                setHead(nodeToInsert);
                return;
            }

            Node temp = head;
            int pos = 1;

            while (temp != null && pos++ != position) {
                temp = temp.next;
            }
            if (temp != null) {
                insertBefore(temp, nodeToInsert);
            } else {
                setTail(nodeToInsert);
            }
        }

        public void removeNodesWithValue(int value) {
            Node temp = head;
            while (temp != null) {
                Node nodeToRemove = temp;
                temp = temp.next;
                if (nodeToRemove.value == value) {
                    remove(nodeToRemove);
                }
            }
        }

        public void remove(Node node) {
            if (node == head) {
                head = head.next;
            }
            if (node == tail) {
                tail = tail.prev;
            }
            removeNode(node);
        }

        public boolean containsNodeWithValue(int value) {
            Node temp = head;
            while (temp != null) {
                if (temp.value == value) {
                    return true;
                }
                temp = temp.next;
            }
            return false;
        }

        private void removeNode(Node node) {
            if (node.prev != null) {
                node.prev.next = node.next;
            }
            if (node.next != null) {
                node.next.prev = node.prev;
            }
            node.prev = null;
            node.next = null;
        }
    }

    static class Node {
        public int value;
        public Node prev;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }

}
