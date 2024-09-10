package tratamentoDeExcecoes.atividadeProposta2.aplication;

import java.util.Scanner;

import tratamentoDeExcecoes.atividadeProposta2.model.exceptions.DomainException;
import tratamentoDeExcecoes.atividadeProposta2.model.entities.Account;


public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account data.");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Initial balance: ");
        double balance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();
        try {
            Account conta = new Account(number, holder, balance, withdrawLimit);
            System.out.println();
            System.out.print("Enter amount to withdraw: ");
            double withdraw = sc.nextDouble();
            conta.withdraw(withdraw);
            System.out.printf("New balance: %.2f%n", conta.getBalance());
        } catch (DomainException e) {
            System.out.println("Error in : " + e.getMessage());
        }
        sc.close();
    }

}
