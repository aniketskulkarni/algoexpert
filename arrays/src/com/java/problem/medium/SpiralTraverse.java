package com.java.problem.medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraverse {

    public static List<Integer> spiralTraverse(int[][] array) {
        if (array == null || array.length == 0) {
            return new ArrayList<Integer>();
        }

        List<Integer> spiralTraverse = new ArrayList<>();

        int startRow = 0;
        int endRow = array.length - 1;
        int startCol = 0;
        int endCol = array[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            for (int col = startCol; col <= endCol; col++) {
                spiralTraverse.add(array[startRow][col]);
            }

            for (int row = startRow + 1; row <= endRow; row++) {
                spiralTraverse.add(array[row][endCol]);
            }

            for (int col = endCol - 1; col >= startCol; col--) {
                if (startRow == endRow) {
                    break;
                }
                spiralTraverse.add(array[endRow][col]);
            }

            for (int row = endRow - 1; row > startRow; row--) {
                if (startCol == endCol) {
                    break;
                }
                spiralTraverse.add(array[row][startCol]);
            }

            startRow += 1;
            endRow -= 1;
            startCol += 1;
            endCol -= 1;
        }

        return spiralTraverse;
    }

    public static void main(String[] args) {
        int[][] array = new int[][] { { 1, 2, 3, 4 }, { 12, 13, 14, 5 }, { 11, 16, 15, 6 }, { 10, 9, 8, 7 } };

        List<Integer> result = spiralTraverse(array);
        for (Integer res : result) {
            System.out.print(res + " ");
        }
    }
}