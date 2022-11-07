package com.polovyi.ivan.tutorials;

public class TutorialArrays {

    public static void main(String[] args) {

        // Array declaration
        int[] tutorialArray;
        int tutorialArrayDifferentDeclaration[];

        // Array memory allocation for 5 integers
        tutorialArray = new int[5];

        // Array's first, second, third and fourth element initialization
        tutorialArray[0] = 1;
        tutorialArray[1] = 2;
        tutorialArray[2] = 3;
        tutorialArray[3] = 4;
        // The last element will be 0, as it defaults to the default value of the type of an array

        // Array allocation + initialization

        int[] oneLineAllocInitArray;
        oneLineAllocInitArray = new int[] { 1, 2, 3, 4 };

        // Array declaration + allocation
        int[] oneLineDeclAllocArray = new int[5];
        tutorialArray[0] = 1;
        tutorialArray[1] = 2;
        tutorialArray[2] = 3;
        tutorialArray[3] = 4;

        // Array declaration + allocation + initialization
        int[] oneLineDeclAllocArrayInitArray = new int[] { 1, 2 };

        int[] simplifiedOeLineDeclAllocArrayInitArray = { 1, 2, 3, 4 };

        // Invalid declaration
        //        int[] simplifiedOeLineDeclAllocArrayInitArray;
        //         simplifiedOeLineDeclAllocArrayInitArray = { 1, 2, 3, 4 };

    }

}
