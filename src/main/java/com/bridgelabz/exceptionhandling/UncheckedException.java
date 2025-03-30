package com.bridgelabz.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter numerator: ");
            int num1 = sc.nextInt();

            System.out.print("Enter denominator: ");
            int num2 = sc.nextInt();

            int result = num1 / num2;
            System.out.print("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
            System.out.println("Error: Division by zero is not allowed");
        }
        catch (InputMismatchException e) {
            System.out.println("InputMismatchException caught: " + e.getMessage());
            System.out.println("Error: Invalid value for division");
        }
    }
}

/*
Input:
    Enter numerator: 10
    Enter denominator: 0
Output:
    ArithmeticException caught: / by zero
    Error: Division by zero is not allowed

Input:
    Enter numerator: 10
    Enter denominator: a
Output:
    InputMismatchException caught: null
    Error: Invalid value for division
 */