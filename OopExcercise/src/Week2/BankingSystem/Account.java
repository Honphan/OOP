package Week2.BankingSystem;

import java.util.List;
import java.util.Objects;

public abstract class Account {
    public static final String CHECKING = "CHECKING";
    public static final String SAVINGS = "SAVINGS";
    protected long accountNumber;
    protected double balance;
    List<Transaction> transactionList;

    public Account(){
         this.accountNumber = -1;
         this.balance = 0;
    }

    public Account(long accountNumber, double balance){
          this.accountNumber = accountNumber;
          this.balance = balance;
    }

    public String getTransaction(){
        return null;
    }

    public void addTransaction(Transaction transaction){
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public  void doWithdrawing(double amount){};
    public  void doDepositing(double amount){};

   public boolean equals(Objects obj){
       return false;
   }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
}
