public class Transaction {
    public static final int TYPE_DEPOSIT_CHECKING = 1;
    public static final int TYPE_DEPOSIT_SAVINGS = 2;
    public static final int TYPE_WITHDRAW_CHECKING = 3;
    public static final int TYPE_WITHDRAW_SAVINGS = 4;

    private int type;
    private double amount;
    private double initialBalance;
    private double finalBalance;
    /**
     * Transaction constructor 1.
     */
    public Transaction(int type, double amount, double initialBalance, double finalBalance) {
        this.type = type;
        this.amount = amount;
        this.initialBalance = initialBalance;
        this.finalBalance = finalBalance;
    }

    /**
     * Transaction constructor 1.
     */
    public Transaction() {
        this.type = 0;
        this.amount = 0;
        this.initialBalance = 0;
        this.finalBalance = 0;
    }


    /**
     * Transaction constructor 1.
     */
    private String getTransactionTypeString(int type) {
       if( type == 1 ){
           return "Nạp tiền vãng lai";
       } else if( type == 2 ){
           return "Nạp tiền tiết kiệm";
       } else if( type == 3 ){
           return "Rút tiền vãng lai";
       } else if ( type == 4 ){
           return "Rút tiền tiết kiệm";
       }
       return "";
    }

    /**
     * Get Transaction summary.
     */
    public String getTransactionSummary(int type) {
        return String.format(
                "\n- \nKiểu giao dịch: %s. Số dư ban đầu: $%.2f. "
                        + "Số tiền: $%.2f. Số dư cuối: $%.2f.",
                getTransactionTypeString(type),
                this.initialBalance,
                this.amount,
                this.finalBalance
        );
    }

    public int getType() {
        return type;
    }
}
