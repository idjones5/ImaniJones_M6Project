package com.company;

import java.util.Arrays;

public class ArrayFunReverseIt {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] reverseArr1 = new int[5];

        System.out.print("Original Array: \n");
        for (int i = 0; i < arr1.length; i++) {
            int j = arr1.length - 1 - i;
            reverseArr1[j] = arr1[i];
            System.out.print(arr1[i] + " ");
        }
        System.out.print("\nReversed Array: \n");
        for (int element: reverseArr1) {
            System.out.print(element + " ");
        }
    }
}


