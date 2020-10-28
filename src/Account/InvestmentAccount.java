package Account;

public class InvestmentAccount extends BankAccount {
    private int investment;
    private int period = 4;

    public InvestmentAccount(int balance, String owner, String AccountNum) {
        super(balance, owner, AccountNum, "Investment");
        this.investment = investment;
    }

    public void applyInvestment() {
        int appliedInvestment = balance * (investment/100);
    }


}
