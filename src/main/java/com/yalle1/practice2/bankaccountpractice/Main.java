package com.yalle1.practice2.bankaccountpractice;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank();

        // Add some accounts
        bank.addAccount("Alice", "password123");
        bank.addAccount("Bob", "password456");

        // Log in to an account
        BankAccount aliceAccount = bank.login("Alice", "password123");

        // Deposit funds into Alice's account
        aliceAccount.deposit(new BigDecimal("100.00"));

        // Withdraw funds from Alice's account
        aliceAccount.withdraw(new BigDecimal("50.00"));

        aliceAccount.checkBalance();
    }

}
