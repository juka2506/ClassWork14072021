package com.company;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();
        if(checkForOddNumbers(number)) {
            System.out.println("You have entered odd number " + number);
        } else if (checkForEvenNumbers(number)) {
            System.out.println("You have entered even number " + number);
        }
    }

    public static boolean checkForOddNumbers (int number) {
        return number % 2 != 0;
    }

    public static boolean checkForEvenNumbers (int number) {
        return number % 2 == 0;
    }
}
