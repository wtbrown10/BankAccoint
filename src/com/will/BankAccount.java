package com.will;

public class BankAccount {
    // fields or attributes
    private int balance;
    private String owner;
    private String accountNum;
    private String type;

    // Constructor
    public BankAccount(int balance, String owner, String accountNum, String type) {
        this.balance = balance;
        this.owner = owner;
        this.accountNum = accountNum;
        this.type = type;

    }
    public void deposit(int amt) {
        if (amt > 0) {
            balance += amt;
        }
    }

    public void withdraw(int amt) {
        if (amt <= balance) {
            balance -= amt;
        }
    }

    @Override
    public String toString() {
        return "type: " + type + "\tAccountNumber: " + accountNum + "\towner: " + owner + "\tbalance: " + balance;
    }
}
