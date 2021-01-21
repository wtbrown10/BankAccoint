package Account;

public class BankAccount implements Account {
    protected int balance;
    private String owner;
    private String accountNum;
    private String type;

    public BankAccount(int balance, String owner, String accountNum, String type){
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
    public String getAccountNum() {
        return accountNum;
    }

    @Override
    public String toString() {
        int dollar = balance / 100;
        int cents = balance % 100;
        String balanceF = "$"+dollar + "." + cents;
        return "type: " + type + "\tAccountNum: " + accountNum + "\tOwner: " + owner + "\tbalance: " + balance;
    }

    public int getBalance() { return balance; }

}