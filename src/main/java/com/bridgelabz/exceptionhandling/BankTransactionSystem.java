package com.bridgelabz.exceptionhandling;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class BankTransactionSystem {
    public static void main(String[] args) {
        BankTransactionSystem account = new BankTransactionSystem(1000.0);

        try {
            account.withdraw(2000.0);
        }
        catch (InsufficientBalanceException e) {
            System.out.println("InsufficientBalanceException caught: " + e.getMessage());
        }
        catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        }
    }

    private double balance;

    public BankTransactionSystem(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to withdraw amount and throw IllegalArgumentException and InsufficientBalanceException
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }
}

/*
Input:
    Initial Balance: 1000.0
    Withdraw Amount: 2000.0
Output:
    InsufficientBalanceException caught: Insufficient balance!

Input:
    Initial Balance: 1000.0
    Withdraw Amount: -500.0
Output:
    IllegalArgumentException caught: Invalid amount!

Input:
    Initial Balance: 1000.0
    Withdraw Amount: 550.0
Output:
    Withdrawal successful, new balance: 450.0
 */