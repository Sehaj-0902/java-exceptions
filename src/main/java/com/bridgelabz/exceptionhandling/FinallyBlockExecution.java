package com.bridgelabz.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlockExecution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter numerator: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter denominator: ");
            int num2 = scanner.nextInt();

            int result = num1 / num2;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
            System.out.println("Error: Division by zero is not allowed");
        }
        catch (InputMismatchException e) {
            System.out.println("InputMismatchException caught: " + e.getMessage());
            System.out.println("Error: Invalid value for division");
        }
        finally {
            System.out.println("Operation completed.");
        }
    }
}

/*
Input:
    Enter numerator: 20
    Enter denominator: 0
Output:
    ArithmeticException caught: / by zero
    Error: Division by zero is not allowed
    Operation completed.
 */