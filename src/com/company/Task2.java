package com.company;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String line = scanner.nextLine();
        char[] lineInChar = line.toCharArray();
        for (int i = lineInChar.length - 1; i >= 0 ; i--) {
            System.out.print(lineInChar[i]);
        }
    }
}
