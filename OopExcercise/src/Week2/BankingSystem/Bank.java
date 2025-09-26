package Week2.BankingSystem;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bank {
    private List<Customer> customerList = new ArrayList<>();

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
                    Account acc = new SavingAccount(Double.valueOf(tokens[0]).longValue(), Double.valueOf(tokens[2]));
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

    public String getCustomersInfoByNameOrder() {
        List<Customer> sortedList = customerList.stream()
                .sorted((c1, c2) -> {
                    String[] fullName1 = c1.getFullName().trim().split(" ");
                    String lastName1 = fullName1[fullName1.length - 1];
                    String[] fullName2 = c2.getFullName().trim().split(" ");
                    String lastName2 = fullName2[fullName2.length - 1];
                    return lastName2.compareTo(lastName1);
                })
                .toList();
        StringBuilder result = new StringBuilder();
        for (Customer customer : sortedList) {
            result.append("Số CMND: " + customer.getIdNumber() + ". " + "Họ tên: " + customer.getFullName() + ".\n");
        }
        return result.toString();
    }

    public String getCustomersInfoByIdOrder() {
        List<Customer> sortedList = customerList.stream().sorted((c1, c2) -> (int) (c1.getIdNumber() - c2.getIdNumber())).toList();
        StringBuilder result = new StringBuilder();
        for (Customer customer : sortedList) {
            result.append("Số CMND: " + customer.getIdNumber() + ". " + "Họ tên: " + customer.getFullName() + ".\n");
        }
        return result.toString();
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }
}
