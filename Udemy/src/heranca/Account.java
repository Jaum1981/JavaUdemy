package heranca;

public class Account {

    protected int number;
    protected String holder;
    protected double amount;

    public Account(){
    }

    public Account(int number, String holder, double amount) {
        this.number = number;
        this.holder = holder;
        this.amount = amount;
    }

    public void withdraw(double amount){
        this.amount-= amount;
    }

    public void deposit(double amount){
        this.amount+= amount;
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
        return amount;
    }

    

}
