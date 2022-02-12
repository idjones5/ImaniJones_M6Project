package com.company;

public class ArrayFunReverseIt {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] reverseArr1 = new int[5];


        for (int i = 0; i < arr1.length; i++) {
            int j = arr1.length - 1 - i;
            reverseArr1[j] = arr1[i];
        }
        for (int element: reverseArr1) {
            System.out.print(element + " ");
        }
    }
}


