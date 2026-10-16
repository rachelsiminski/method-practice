package com.pluralsight;

import java.util.Scanner;

public class Format {

    public static void main(String[] args) {
        // main() method
        Scanner scanner = new Scanner(System.in);

        // Read user info and store
        System.out.println("Enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = scanner.nextLine();
        formatName(firstName, lastName);

        // Display results
        System.out.println(formatName(firstName, lastName));
    }

    public static String formatName(String first, String last) {
        String lastFirst = last + first;

        return lastFirst;
    }
}
