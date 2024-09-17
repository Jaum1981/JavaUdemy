package heranca;

public class BusinessAccount extends Account {

    @SuppressWarnings("unused")
    private double loanLimit;

    public BusinessAccount() {
    }

    public BusinessAccount(int number, String holder, double balance, double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {

    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        balance -= 2.0;
    }

}   
