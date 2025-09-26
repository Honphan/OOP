package Week2.BankingSystem;

public class InsufficientFundsException extends BankException{
    public InsufficientFundsException(double amount) {
        super("Insufficient Funds Exception: " + amount);
    }
}
