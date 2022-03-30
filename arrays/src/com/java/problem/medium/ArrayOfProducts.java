package com.java.problem.medium;

public class ArrayOfProducts {

    // Time: O(n^2) | Space: O(n)
    public int[] arrayOfProducts(int[] array) {
        if (array == null || array.length == 0) {
            return new int[0];
        }

        int[] products = new int[array.length];
        for (int loop = 0; loop < array.length; loop++) {
            int product = 1;
            int index = 0;
            while (index < array.length) {
                if (loop != index) {
                    product = product * array[index];
                }
                index += 1;
            }
            products[loop] = product;
        }
        return products;
    }

    public static void main(String[] args) {
        ArrayOfProducts obj = new ArrayOfProducts();
        int[] products = obj.arrayOfProducts(new int[] { 1, 2, 3, 4, 5 });
        for (int i : products) {
            System.out.print(i + " ");
        }
    }
}
