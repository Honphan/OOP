
import java.util.ArrayList;
import java.util.List;

public abstract class Account {
    public static final String CHECKING = "CHECKING";
    public static final String SAVINGS = "SAVINGS";
    protected long accountNumber;
    protected double balance;
    protected List<Transaction> transactionList;

    /**
     * Transaction constructor 1.
     */
    public Account() {
        this.accountNumber = -1;
        this.balance = 0;
    }

    /**
     * Transaction constructor 1.
     */
    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transactionList = new ArrayList<>();
    }

    /**
     * Transaction constructor 1.
     */
    public String getTransactionHistory() {
        StringBuilder result = new StringBuilder();
        if (transactionList != null) {
            result.append("Lịch sử giao dịch của tài khoản " + accountNumber + ":");
            for (Transaction transaction : transactionList) {
                result.append(transaction.getTransactionSummary(transaction.getType()));
            }
        }
        return result.toString();
    }

    /**
     * Transaction constructor 1.
     */
    public void addTransaction(Transaction transaction) {
        this.transactionList.add(transaction);
    }

    /**
     * Transaction constructor 1.
     */
    public abstract void deposit(double amount);

    /**
     * Transaction constructor 1.
     */
    public abstract void withdraw(double amount);

    /**
     * Transaction constructor 1.
     */
    public void doWithdrawing(double amount) throws InsufficientFundsException, InvalidFundingAmountException {
        if (amount <= 0) {
            throw new InvalidFundingAmountException(amount);
        } else if (amount > balance) {
            throw new InsufficientFundsException(amount);
        } else {
            balance -= amount;
        }

    }

    /**
     * Transaction constructor 1.
     */
    public void doDepositing(double amount) throws InvalidFundingAmountException {
        if (amount <= 0) {
            throw new InvalidFundingAmountException(amount);
        } else {
            balance += amount;
        }
    }

    /**
     * Transaction constructor 1.
     */
    @Override
    public boolean equals(Object o) {
        if (o instanceof Account) {
            Account a = (Account) o;
            return this.accountNumber == ((Account) o).getAccountNumber();
        }
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
