package com.yalle1.practice2.bankaccountpractice;

import java.math.BigDecimal;
import java.util.UUID;

public class BankAccount {

    private String name, password;
    private final UUID ID;
    private BigDecimal balance;


    public BankAccount(String name, String password, UUID id) {
        setName(name);
        setPassword(password);
        this.balance = BigDecimal.valueOf(0);
        this.ID = id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()){
            throw new IllegalArgumentException("Name is blank");
        } else

            this.name = name;

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {

        if (password == null || password.isBlank()){
            throw new IllegalArgumentException("Password is blank");
        }

        password = password.trim();

        if (password.length() < 8){
            throw new IllegalArgumentException("Password must be at least 8 characters long");
        }

        int digit = 0;
        int letter = 0;

        // at least one digit, one character
        for (char c : password.toCharArray()) {

            if (Character.isWhitespace(c)){
                throw new IllegalArgumentException("Password can not contain any spaces");
            }

            if (Character.isDigit(c)){
                digit++;
            }
            if (Character.isLetter(c)){
                letter++;
            }
        }

        if (digit == 0){
            throw new IllegalArgumentException("Password must contain at least 1 digit");
        }
        if (letter == 0){
            throw new IllegalArgumentException("Password must contain at least 1 letter");
        }

        this.password = password;
    }

    public UUID getID() {
        return ID;
    }


    public BigDecimal getBalance() {
        return balance;
    }

    public void deposit(BigDecimal amount){

        if (amount.compareTo(BigDecimal.ZERO) <= 0 ){
            System.out.println("Invalid deposit amount.");

        } else {
            balance = balance.add(amount);
            System.out.println("Deposit of $"+amount+" successful.");
        }

    }

    public void withdraw(BigDecimal amount){

        if (amount.compareTo(BigDecimal.ZERO) <= 0){
            System.out.println("Invalid withdrawal amount.");

        } else if (balance.compareTo(amount) >= 0) {
            balance = balance.subtract(amount);
            System.out.println("Withdrawal of $"+ amount+" successful.");

        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void checkBalance(){

        System.out.println("Balance: $"+balance);

    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", ID=" + ID +
                ", balance=" + balance +
                '}';
    }
}
