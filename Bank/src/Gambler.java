public class Gambler extends Account{
    public Gambler(int balance){
        super(balance);
    }

    public boolean withdraw(int money){
        int conv = (int)(Math.random()*100) + 1;
        System.out.println(conv);
        if(conv >= 50 && 2 * money <= balance){
            balance -= 2*money;
            transactions++;
            return true;

        }
        else{
            transactions++;
            return true;
        }
    }

    public void endMonthCharge(){

    }
}
