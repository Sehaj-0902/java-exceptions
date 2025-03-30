package com.bridgelabz.exceptionhandling;

import java.util.Scanner;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter array size: ");
            int size = sc.nextInt();

            int[] array = new int[size];

            System.out.println("Enter " + size + " elements: ");
            for (int i = 0; i < 5; i++) {
                array[i] = sc.nextInt();
            }

            System.out.print("Enter index number: ");
            int index = sc.nextInt();

            System.out.println("Value at index " + index + ": " + array[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: Invalid index!");
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException caught: Array is not initialized!");
        }
    }
}

/*
Input:
    Enter array size: 5
    Enter array elements:
    11
    30
    5
    16
    22
    Enter index number: 7
Output:
    ArrayIndexOutOfBoundsException caught: Invalid index!
 */