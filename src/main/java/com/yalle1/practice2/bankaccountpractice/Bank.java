package com.yalle1.practice2.bankaccountpractice;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Bank {

        private Map<UUID, BankAccount> accounts;

        public Bank(){
            this.accounts = new HashMap<>();
        }

        public void addAccount(String name, String password){

            if (name == null || name.isBlank()){
                throw new IllegalArgumentException("Invalid name");
            }
            if (password == null || password.isBlank()){
                throw new IllegalArgumentException("Invalid password");
            }

            UUID id = UUID.randomUUID();

            while (accounts.containsKey(id)){
                id = UUID.randomUUID();
            }

            BankAccount account = new BankAccount(name, password, id);
            accounts.put(id, account);
            System.out.println("Account created successfully for " + name);
        }

    public BankAccount login(String name, String password){
        for (BankAccount account : accounts.values()) {
            if (account.getName().equals(name)) {
                if (account.getPassword().equals(password)) {
                    System.out.println("Logged in successfully as " + name);
                    return account;
                } else {
                    throw new IllegalArgumentException("Incorrect password");
                }
            }
        }
        throw new IllegalArgumentException("No account found with this name");
    }
}
