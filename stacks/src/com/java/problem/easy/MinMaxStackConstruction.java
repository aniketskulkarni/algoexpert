package com.java.problem.easy;

import java.util.ArrayList;
import java.util.List;

public class MinMaxStackConstruction {
    static class MinMaxStack {
        int top = -1;
        List<Integer> stacks = new ArrayList<>();
        List<Integer> mins = new ArrayList<>();
        List<Integer> maxs = new ArrayList<>();

        public MinMaxStack() {
            mins.add(-1);
            maxs.add(-1);
        }

        // Time: O(1) | Space: O(1)
        public int peek() {
            return top;
        }

        // Time: O(1) | Space: O(1)
        public int pop() {
            int popedElem = stacks.remove(stacks.size() - 1);
            top = -1;
            if (stacks.size() != 0) {
                top = stacks.get(stacks.size() - 1);
            }
            if (popedElem == mins.get(mins.size() - 1)) {
                mins.remove(mins.size() - 1);
            }
            if (popedElem == maxs.get(maxs.size() - 1)) {
                maxs.remove(maxs.size() - 1);
            }
            return popedElem;
        }

        // Time: O(1) | Space: O(1)
        public void push(Integer number) {
            // Write your code here.
            stacks.add(number);
            int max = maxs.get(maxs.size() - 1);
            int min = mins.get(mins.size() - 1);
            if (number >= max || max == -1) {
                maxs.add(number);
            }
            if (number <= min || min == -1) {
                mins.add(number);
            }
            top = number;
        }

        // Time: O(1) | Space: O(1)
        public int getMin() {
            return mins.get(mins.size() - 1);
        }

        // Time: O(1) | Space: O(1)
        public int getMax() {
            return maxs.get(maxs.size() - 1);
        }
    }

    public static void main(String[] args) {
        MinMaxStack obj = new MinMaxStack();
        obj.push(5);
        obj.getMin();
        obj.getMax();
        obj.peek();
        obj.push(5);
        obj.getMin();
        obj.getMax();
        obj.peek();
        obj.push(5);
        obj.getMin();
        obj.getMax();
        obj.peek();
        obj.push(5);
        obj.getMin();
        obj.getMax();
        obj.peek();
        obj.push(8);
        obj.getMin();
        obj.getMax();
        obj.peek();
        obj.push(8);
        obj.getMin();
        obj.getMax();
        obj.peek();
        obj.push(0);
        obj.getMin();
        obj.getMax();
        obj.peek();
        obj.push(8);
        obj.getMin();
        obj.getMax();
        obj.peek();
        obj.push(9);
        obj.getMin();
        obj.getMax();
        obj.peek();
        obj.push(5);
        obj.getMin();
        obj.getMax();
        obj.peek();

        obj.pop();
        obj.getMin();
        obj.getMax();
        obj.peek();

        obj.pop();
        obj.getMin();
        obj.getMax();
        obj.peek();

        obj.pop();
        obj.getMin();
        obj.getMax();
        obj.peek();

        obj.pop();
        obj.getMin();
        obj.getMax();
        obj.peek();

        obj.pop();
        obj.getMin();
        obj.getMax();
        obj.peek();

        obj.pop();
        obj.getMin();
        obj.getMax();
        obj.peek();

        obj.pop();
        obj.getMin();
        obj.getMax();
        obj.peek();

        obj.pop();
        obj.getMin();
        obj.getMax();
        obj.peek();

        obj.pop();
        obj.getMin();
        obj.getMax();
        obj.peek();
    }
}
