package com.will;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BankAccount myAcct = new BankAccount(10_0000, "Phil", "1234", "Checking");
        CheckingAccount myChecking = new CheckingAccount(20000, "chelsea", "9876", "Checking");
        System.out.println(myAcct.toString());
        System.out.println(myChecking.toString());
        myAcct.deposit(1_000);
        myChecking.deposit(2_000);
        System.out.println(myAcct.toString());
        System.out.println(myChecking.toString());
        myAcct.withdraw(10_000);
        myChecking.withdraw(1_000);
        System.out.println(myAcct.toString());
        System.out.println(myChecking.toString());
        myAcct.withdraw(10_000_000);
        myChecking.withdraw(1_000_000);
        System.out.println(myAcct.toString());
        System.out.println(myChecking.toString());
    }
}
