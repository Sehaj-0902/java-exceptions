package com.bridgelabz.exceptionhandling;

public class MethodExceptionPropagation {
    public static void main(String[] args) {
        try {
            method2();
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: Handled exception in main");
        }
    }

    // Method to throw an ArithmeticException
    public static void method1() {
        int result = 10 / 0;
        System.out.println("Result: " + result);
    }

    // Method to call method1()
    public static void method2() {
        method1();
    }
}

/*
Output:
    ArithmeticException caught: Handled exception in main
 */