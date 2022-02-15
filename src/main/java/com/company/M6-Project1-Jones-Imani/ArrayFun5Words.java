package com.company;

import java.util.Scanner;

public class ArrayFun5Words {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] userArr = new String[5];
        String userWords;

        for (int i = 0; i < userArr.length; i++) {
            System.out.println("Please enter a word:");
            userWords = scan.nextLine();
            userArr[i] = userWords;
        }
        System.out.println("\nYour words are: ");
        for (String element : userArr) {
            System.out.print(element + "\n");
        }
    }
}

