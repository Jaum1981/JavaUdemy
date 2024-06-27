package heranca;

public class Account {

    protected int number;
    protected String holder;
    protected double balance;

    public Account(){
    }

    public Account(int number, String holder, double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public void withdraw(double amount){
        this.balance-= amount + 5.0;
    }

    public void deposit(double amount){
        this.balance+= amount;
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getAmount() {
        return balance;
    }

    

}
