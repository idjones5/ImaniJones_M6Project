package com.company;

import java.util.Scanner;

public class ArrayFunUserArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] userArr = new int[5];
        String userNumbers;

        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter an integer: ");
            userNumbers = scan.nextLine();
            userArr[i] = Integer.parseInt(userNumbers);
        }
        System.out.println("The numbers you entered are: ");
        for (int element: userArr) {
            System.out.print(element + " ");
        }
    }
}
