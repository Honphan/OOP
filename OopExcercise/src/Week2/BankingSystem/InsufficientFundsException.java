
public class InsufficientFundsException extends BankException {
    public InsufficientFundsException(double amount) {
        super("Insufficient Funds Exception: " + amount);
    }

    public InsufficientFundsException() {
        super("Insufficient Funds Exception");
    }
}
