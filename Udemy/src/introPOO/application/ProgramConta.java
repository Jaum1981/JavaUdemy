package introPOO.application;

import java.util.Scanner;

import introPOO.entitie.Conta;

public class ProgramConta {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Conta conta1;

        System.out.println("Enter number account: ");
        int numberAccount = sc.nextInt();
        System.out.println("Enter name account: ");
        sc.nextLine(); //para consumir a quebra de linha do nextInt()
        String nameAccount = sc.nextLine();
        System.out.println("Do you want a initial deposit? (s/n)");
        char answer = sc.next().charAt(0);
        if (answer != 'n') {
            System.out.println("Enter initial deposit: ");
            double initialDeposit = sc.nextDouble();
            conta1 = new Conta(numberAccount, nameAccount, initialDeposit);
        } else {
            conta1 = new Conta(numberAccount, nameAccount);
        }

        System.out.println("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        conta1.deposito(depositValue);
        System.out.println(conta1);

        System.out.println("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        conta1.saque(withdrawValue);
        System.out.println(conta1);

        sc.close();
    }
}
