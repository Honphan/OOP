public class NormalAcount extends Account {
    public NormalAcount(int balance){
        super(1000);
    }

    public void endMonthCharge(){
        int fee = 10;
        if(balance > fee){
            balance -= fee;
        }
        else{
            balance = 0;
        }

        System.out.println(balance);
    }
}
