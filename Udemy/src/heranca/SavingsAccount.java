package heranca;

public class SavingsAccount extends Account{

    private double interestRate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(int number, String holder, double amount, double interestRate) {
        super(number, holder, amount);
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        amount += amount*interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    

}
