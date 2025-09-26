package Week2.BankingSystem;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        InputStream inputStream = Main.class.getResourceAsStream("input.txt");
        bank.readCustomerList(inputStream);
        for(Customer customer: bank.getCustomerList()){
            System.out.print(customer.getCustomerInfo());
        }
        System.out.println(bank.getCustomersInfoByNameOrder());
    }
}
