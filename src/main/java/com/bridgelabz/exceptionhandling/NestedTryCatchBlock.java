package com.bridgelabz.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedTryCatchBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter array size: ");
            int size = sc.nextInt();

            int[] array = new int[size];

            System.out.println("Enter array elements:");
            for (int i = 0; i < size; i++) {
                array[i] = sc.nextInt();
            }

            System.out.print("Enter index: ");
            int index = sc.nextInt();

            System.out.print("Enter divisor: ");
            int divisor = sc.nextInt();

            try {
                int element = array[index];
                int result = element / divisor;
                System.out.println("Result: " + result);
            }
            catch (ArithmeticException e) {
                System.out.println("ArithmeticException caught: Cannot divide by zero!");
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException caught: Invalid array index!");
            }
        }
        catch (InputMismatchException e) {
            System.out.println("InputMismatchException caught: Invalid input for division");
        }
    }
}

/*
Input:
    Enter array size: 5
    Enter array elements:
    11
    20
    4
    17
    23
    Enter index: 3
    Enter divisor: 0
Output:
    ArithmeticException caught: Cannot divide by zero!

Input:
    Enter array size: 5
    Enter array elements:
    11
    20
    4
    17
    23
    Enter index: 7
    Enter divisor: 2
Output:
    ArrayIndexOutOfBoundsException caught: Invalid array index!
 */