package com.bridgelabz.exceptionhandling;

import java.util.Scanner;

class InvalidAgeException extends Exception {
    InvalidAgeException (String message) {
        super(message);
    }
}

public class CustomException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();

            validateAge(age);
        }
        catch (InvalidAgeException e) {
            System.out.println("InvalidAgeException caught: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Invalid Input");
        }
    }

    // Method to validate age
    public static void validateAge(int age) throws InvalidAgeException {
        if (age >= 18) {
            System.out.println("Access granted!");
        }
        if (age < 18) {
            throw  new InvalidAgeException("Age must be 18 or above");
        }
    }
}

/*
Input:
    Enter age: 20
Output:
    Access granted!

Input:
    Enter age: 16
Output:
    InvalidAgeException caught: Age must be 18 or above
 */