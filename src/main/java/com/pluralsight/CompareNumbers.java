package com.pluralsight;

import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        // Initialize scanner
        Scanner scanner = new Scanner(System.in);

        // Read input from user
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        // Display results
        System.out.println("Your number: " + number);
        System.out.println("Number is even: " + isEven(number));
        System.out.println("Number is positive: " + isPositive(number));
    }

    // isEven(): Check if a number is even or odd
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // isPositive(): Check if a number is positive or negative
    public static boolean isPositive(double number) {
        return number > 0;
    }
}
