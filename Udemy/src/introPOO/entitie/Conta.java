package introPOO.entitie;

public class Conta {
    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    public Conta(int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }

    public Conta(int numeroConta, String nomeTitular, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        deposito(depositoInicial);
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void saque(double valor) {
        this.saldo -= valor + 5.0;
    }

    public void deposito(double valor) {
        this.saldo += valor;
    }

    public String toString() {
        return "Account data: %n" + "Account number:" + getNumeroConta() + ", "
                + "Holder: " + getNomeTitular() + ", " + "Balance: $" + String.format("%.2f", getSaldo());
    }

}
