package com.polovyi.ivan.tutorials;

import java.util.Arrays;

public class AccessToArrayElements {

    public static void main(String[] args) {

        int[] tutorialArray = new int[] { 1, 2, 3, 4 };

        System.out.println("Get n element of an array");
        System.out.println("The first element of an array is " + tutorialArray[0]);

        System.out.println("Forward for loop");
        for (int i = 0; i < tutorialArray.length; i++) {
            System.out.println("tutorialArray element at index " + i + " is " + tutorialArray[i]);
        }

        System.out.println("Backward (reverse) for loop");
        for (int i = tutorialArray.length - 1; i >= 0; i--) {
            System.out.println("tutorialArray element at index " + i + " is " + tutorialArray[i]);
        }

        System.out.println("For each loop");
        for (int element : tutorialArray) {
            System.out.println("tutorialArray elements are " + element);
        }

        System.out.println("While forward loop");
        int index = 0;

        while (index < tutorialArray.length) {
            System.out.println("tutorialArray element at index " + index + " is " + tutorialArray[index++]);
        }

        System.out.println("While backward loop");
        int tutorialArrayLastIndex = tutorialArray.length - 1;

        while (tutorialArrayLastIndex >= 0) {
            System.out.println(
                    "tutorialArray element at index " + tutorialArrayLastIndex + " is "
                            + tutorialArray[tutorialArrayLastIndex--]);
        }

        System.out.println("Do While forward loop");
        int ind = 0;
        do {
            System.out.println("tutorialArray element at index " + ind + " is " + tutorialArray[ind++]);
        } while (ind < tutorialArray.length);

        System.out.println("Do While backward loop");
        int tutorialArrayLastInd = tutorialArray.length - 1;

        do {
            System.out.println(
                    "tutorialArray element at index " + tutorialArrayLastInd + " is "
                            + tutorialArray[tutorialArrayLastInd--]);
        } while (tutorialArrayLastInd >= 0);

        System.out.println("Get arrays elements using Stream ");
        Arrays.stream(tutorialArray).forEach(System.out::println);

        System.out.println("Get multidimensional array elements using for loop");
        int[][] multidimensionalArray = new int[][] {
                { 1, 2, 3, 4, 5 },
                { 1, 2, 3, 4, 5 },
                { 1, 2, 3, 4, 5 } };

        for (int i = 0; i < multidimensionalArray.length; i++) {
            for (int j = 0; j < multidimensionalArray[i].length; j++) {
                System.out.println("Element at index  = " + i + "-" + j + " = " + multidimensionalArray[i][j]);
            }
        }

        System.out.println("Get multidimensional array elements using for each loop");
        for (int[] firstDimension : multidimensionalArray) {
            for (int secondDimension : firstDimension) {
                System.out.println(secondDimension);
            }
        }

    }

}
