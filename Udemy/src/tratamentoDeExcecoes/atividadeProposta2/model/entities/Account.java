package tratamentoDeExcecoes.atividadeProposta2.model.entities;

import tratamentoDeExcecoes.atividadeProposta2.model.exceptions.DomainException;

public class Account {
    private int number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    public Account() {
    }

    public Account(int number, String holder, double balance, double withdrawLimit) throws DomainException {
        if (withdrawLimit <= 0) {
            throw new DomainException("Invalid withdraw limit");
        }
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) throws DomainException {
        if (balance <= 0) {
            throw new DomainException("Not enough balance");
        } else if (amount > withdrawLimit) {
            throw new DomainException("The amount exceeds withdraw limit");
        }
        this.balance -= amount;
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

    public double getBalance() {
        return balance;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }


}
