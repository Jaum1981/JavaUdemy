package heranca;

public final class SavingsAccount extends Account { //não pode ser estendida

    private double interestRate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(int number, String holder, double balance, double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public final void withdraw(double amount) { //não pode ser sobresposta
        balance -= amount;
    }

}
