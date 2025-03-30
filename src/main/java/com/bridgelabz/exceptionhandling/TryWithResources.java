package com.bridgelabz.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TryWithResources {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter file path: ");
        String filePath = sc.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String firstLine = reader.readLine();
            if (firstLine != null) {
                System.out.println("First line: " + firstLine);
            }
        }
        catch (IOException e) {
            System.out.println("IOException caught: Error reading file");
        }
    }
}

/*
Input:
    Enter file path:
    ..\java-exceptions\src\main\java\com\bridgelabz\exceptionhandling\data.txt
Output:
    IOException caught: Error reading file

Input:
    Enter file path:
    ..\java-exceptions\src\main\java\com\bridgelabz\exceptionhandling\info.txt
Output:
    First line: Java Exception Handling.
 */