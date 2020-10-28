package com.will;

import Account.BankAccount;
import Account.CheckingAccount;
import Account.SavingsAccount;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BankAccount myAcct = new BankAccount(10_0000, "Phil", "1234", "Checking");
        CheckingAccount myChecking = new CheckingAccount(20000, "chelsea", "9876", "Checking");
        SavingsAccount mySavings = new SavingsAccount(10_000, "Will", "3333", 5);
        System.out.println(myAcct.toString());
        System.out.println(myChecking.toString());
        System.out.println(mySavings.toString());
        myAcct.deposit(1_000);
        myChecking.deposit(2_000);
        mySavings.deposit(10000);
        System.out.println(myAcct.toString());
        System.out.println(myChecking.toString());
        System.out.println(mySavings.toString());
        myAcct.withdraw(10_000);
        myChecking.withdraw(1_000);
        mySavings.withdraw(5000);
        System.out.println(myAcct.toString());
        System.out.println(myChecking.toString());
        System.out.println(mySavings.toString());
        myAcct.withdraw(10_000_000);
        myChecking.withdraw(1_000_000);
        System.out.println(myAcct.toString());
        System.out.println(myChecking.toString());

        mySavings.applyInterest();
        System.out.println(mySavings.toString());
    }
}
