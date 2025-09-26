package Week2.BankingSystem;

public class InvalidFundingAmountException extends BankException{
    public InvalidFundingAmountException(double amount) {
        super("Invalid Funding Amount Exception: " + amount);
    }
}
