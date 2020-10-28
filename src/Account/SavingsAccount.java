package Account;

public class SavingsAccount extends BankAccount {
    private int interest;

    public SavingsAccount(int balance, String owner, String accountNum, int interest ) {
        super(balance, owner, accountNum, "Savings");
        this.interest = interest;
    }

    public void applyInterest() {
        System.out.println("debug interest: " + ((double)interest / 100));
//        int amount = (int)(balance * (interest / 100));
//        balance += amount;
        balance += (int)(balance * (interest / 100)); // process called inline

    }
}
