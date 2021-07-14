package com.company;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter principal: ");
        int principal = scanner.nextInt();

        System.out.print("Please enter rate: ");
        double rate = scanner.nextDouble();

        System.out.print("Please enter time in years: ");
        int time = scanner.nextInt();

        double simpleInterestRate = (principal * rate * time) / 100;

        System.out.println("The simple Interest rate is: " + simpleInterestRate);
    }

}
