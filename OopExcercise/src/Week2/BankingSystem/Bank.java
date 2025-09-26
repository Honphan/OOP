
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bank {
    private List<Customer> customerList;

    public Bank() {
        customerList = new ArrayList<>();
    }

    /**
     * Transaction constructor 1.
     */
    public void readCustomerList(InputStream inputStream) {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line;
        try {
            Customer customer = null;
            Customer currCustomer = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] tokens = line.split(" ");
                if (tokens[1].equals("CHECKING")) {
                    Account acc = new CheckingAccount(Double.valueOf(tokens[0]).longValue(), Double.valueOf(tokens[2]));
                    currCustomer.addAccount(acc);
                } else if (tokens[1].equals("SAVINGS")) {
                    Account acc = new SavingsAccount(Double.valueOf(tokens[0]).longValue(), Double.valueOf(tokens[2]));
                    currCustomer.addAccount(acc);
                } else {
                    customer = new Customer();
                    long idNumber = Double.valueOf(tokens[tokens.length - 1]).longValue();
                    tokens = Arrays.copyOfRange(tokens, 0, tokens.length - 1);
                    String fullName = Arrays.stream(tokens).
                            reduce((a, b) -> {
                                        return a + " " + b;
                                    }
                            ).orElse("");
                    fullName.trim();
                    customer.setFullName(fullName);
                    customer.setIdNumber(idNumber);
                    currCustomer = customer;
                    customerList.add(currCustomer);
                }
            }
            System.out.println("Done");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    /**
     * Transaction constructor 1.
     */
    public String getCustomersInfoByNameOrder() {
        customerList.sort((a, b) -> a.getFullName().compareToIgnoreCase(b.getFullName()));
        StringBuilder result = new StringBuilder();
        for (Customer customer : customerList) {
            result.append("Số CMND: " + customer.getIdNumber() + ". " + "Họ tên: " + customer.getFullName() + ".\n");
        }
        return result.toString();
    }
    /**
     * Transaction constructor 1.
     */
    public String getCustomersInfoByIdOrder() {
        customerList.sort((a, b) -> Long.compare(a.getIdNumber(), b.getIdNumber()));
        StringBuilder result = new StringBuilder();
        for (Customer customer : customerList) {
            result.append("Số CMND: " + customer.getIdNumber() + ". " + "Họ tên: " + customer.getFullName() + ".\n");
        }
        return result.toString();
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }
}
