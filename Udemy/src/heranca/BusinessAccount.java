package heranca;

public class BusinessAccount extends Account{
    
    @SuppressWarnings("unused")
    private double loanLimit;

    public BusinessAccount() {
    }

    public BusinessAccount(int number, String holder, double amount, double loanLimit) {
        super(number, holder, amount);
        this.loanLimit = loanLimit;
    }

    public void loan(double amount){

    }

}   
