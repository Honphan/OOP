public class NickelNDime extends Account {
    public NickelNDime(int balance){
        super(balance);
    }

    public void endMonthCharge(){
        int fee = 2 ;
        int amount = fee * transactions;

        if(balance > amount){
            balance -= amount;
        }
        else{
            balance = 0;
        }

        System.out.println(balance + " " + amount);

    }
}
