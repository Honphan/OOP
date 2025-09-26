//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TestAccount {
    public static void main(String[] args) {
//        Account account = new Account(1000);
//        System.out.println(account.toString());
//
//        account.deposit(100);

//        NormalAcount normalAcount = new NormalAcount(1000);
//        normalAcount.endMonthCharge();
//        System.out.println(normalAcount.toString());

//        NickelNDime nickelNDime = new NickelNDime(1000);
//        nickelNDime.deposit(100);
//        nickelNDime.endMonthCharge();
//        System.out.println(nickelNDime.toString());

        Gambler gambler = new Gambler(1000);

        gambler.withdraw(1000);
        gambler.withdraw(100);
        gambler.endMonthCharge();
        System.out.println(gambler.toString());
    }
}