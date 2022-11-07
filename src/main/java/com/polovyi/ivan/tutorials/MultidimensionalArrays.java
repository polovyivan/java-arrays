package com.polovyi.ivan.tutorials;

public class MultidimensionalArrays {

    public static void main(String[] args) {

        // Array declaration
        int[][] twoDimensionalArray = new int[4][5];

        twoDimensionalArray[0] = new int[] { 1, 2, 3, 4, 5 };
        twoDimensionalArray[1] = new int[] { 1, 2, 3, 4, 5 };
        twoDimensionalArray[2] = new int[] { 1, 2, 3, 4, 5 };

        // Array declaration + allocation + initialization
        int[][] oneLineDeclAllocArrayInitArray = new int[][] {
                { 1, 2, 3, 4, 5 },
                { 1, 2, 3, 4, 5 },
                { 1, 2, 3, 4, 5 } };

        int[][] simplifiedOeLineDeclAllocArrayInitArray = {
                { 1, 2, 3, 4, 5 },
                { 1, 2, 3, 4, 5 },
                { 1, 2, 3, 4, 5 } };
    }

}
