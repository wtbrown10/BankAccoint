package Bank;

import Account.Account;
import Account.CheckingAccount;
import BankTools.DebitCard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Client {
    private String name;
    private String ssn;
    private String address;
    private String firstName;
    private String lastName;
    //    private List<Account> accounts = new ArrayList<>();
    private HashMap<String, Account> accounts = new HashMap<>();
    private List<DebitCard> debitCards = new ArrayList<>();

    public Client(String firstName, String lastName, String ssn, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.name = firstName + " " + lastName;
        this.ssn = ssn;
        this.address = address;
    }

    public void addAccount (Account account) {
        accounts.put(account.getAccountNum(), account);
    }

    public void withdrawAccount(String accountNum, int amount) {
        //find the account
        Account account = accounts.get(accountNum);
        account.withdraw(amount);
        return;
    }

    public void addDebitCard(String accountNum) {
        // accountNum list of accounts find the account.
        // find the account save it in an Account variable
        Account primaryAccount = accounts.get(accountNum);
        // TODO: verify the account is a checking account.
        // using instanceOf
        DebitCard card = new DebitCard("1337", "5555", "032", name, (CheckingAccount) primaryAccount);
        debitCards.add(card);
    }

    public String displayAccounts() {
        String output = "Accounts:\n";
        for (var account : accounts.values()) {
            output += account.toString() + "\n";
        }
        output += "\nDebitCards:\n";
        for (var card : debitCards) {
            output += card.details() + "\n";
        }
        return output;
    }

    public String displayAccount(String accountNum) {
        return accounts.get(accountNum).toString();
    }


}