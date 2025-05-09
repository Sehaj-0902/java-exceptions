package com.bridgelabz.exceptionhandling;

public class ExceptionPropagation {
    public static void main(String[] args) {
        try {
            double interest = calculateInterest(-1000, 0.05, 2);
            System.out.println("Interest: " + interest);

        }
        catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }

    // Method to calculate interest
    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Amount and rate must be positive");
        }
        return amount * rate * years;
    }
}

/*
Output:
    Invalid input: Amount and rate must be positive
 */