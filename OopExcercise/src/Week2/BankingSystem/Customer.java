
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private long idNumber;
    private String fullName;
    private List<Account> accountList;
    /**
     * Transaction constructor 1.
     */
    public Customer() {
        this.idNumber = 0;
        this.fullName = "";
        this.accountList = new ArrayList<>();
    }
    /**
     * Transaction constructor 1.
     */
    public Customer(long idNumber, String fullName) {
        this.idNumber = idNumber;
        this.fullName = fullName;
        this.accountList = new ArrayList<>();
    }
    /**
     * Transaction constructor 1.
     */
    public String getCustomerInfo() {
        StringBuilder result = new StringBuilder();
        result.append(fullName + " " + idNumber + "\n");
        if (accountList.size() > 0) {
            for (Account account : accountList) {
                String type = account instanceof CheckingAccount ? "CHECKING" : "SAVINGS";
                result.append(account.accountNumber + " " + type + " " + account.balance + "\n");
            }
        }
        return result.toString();
    }

    public void addAccount(Account account) {
        accountList.add(account);
    }

    public void removeAccount(Account account) {
        accountList.remove(account);
    }

    public long getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(long idNumber) {
        this.idNumber = idNumber;
    }

    public List<Account> getAccountList() {
        return accountList;
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
