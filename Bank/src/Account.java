public class Account {
    int balance; // so du
    int transactions; // so lan giao dich

    public boolean withdraw(int money){
        if(money > balance){
            return false;
        }
        balance -= money;
        transactions++;
        return true;
    }

    public boolean deposit(int money){
        balance += money;
        transactions++;
        return true;
    }

    public Account(){
        this.balance = 0;
        this.transactions = 0 ;
    }

    public Account(int balance){
        this.balance = balance;
        this.transactions = 0 ;
    }

    public String toString(){
        return "Balance: " + balance + " Transactions: " + transactions;
    }
}
