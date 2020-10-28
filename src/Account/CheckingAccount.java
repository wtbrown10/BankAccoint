package Account;

import Account.BankAccount;

public class CheckingAccount extends BankAccount {
    private int dailyLimit;
    private int dailyWithdrawn = 0;

    public CheckingAccount(int balance, String owner, String accountNum, String type) {
        super(balance, owner, accountNum, "checking");
        this.dailyLimit = dailyLimit;
    }

    public  void resetDailyWithdrawn() {
        dailyWithdrawn = 0;
    }

    @Override
    public void withdraw(int amt) {
        if (dailyWithdrawn + amt > dailyLimit) {
            System.out.println("Error Over Limit!");
            return;
        }
        super.withdraw(amt);
    }
}
