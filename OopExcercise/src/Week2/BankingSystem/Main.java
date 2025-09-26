package Week2.BankingSystem;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        InputStream inputStream = Main.class.getResourceAsStream("input.txt");
        bank.readCustomerList(inputStream);
        bank.getCustomerList().get(0).getAccountList().getFirst().deposit(-500);

        bank.getCustomerList().get(0).getAccountList().getFirst().withdraw(500);
        bank.getCustomerList().get(0).getAccountList().getFirst().deposit(500);

        System.out.println(bank.getCustomerList().get(0).getAccountList().getFirst().getTransactionHistory());

    }
}
