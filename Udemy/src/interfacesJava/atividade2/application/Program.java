package interfacesJava.atividade2.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import interfacesJava.atividade2.entities.Contract;
import interfacesJava.atividade2.entities.Installment;
import interfacesJava.atividade2.services.ContractService;
import interfacesJava.atividade2.services.PaypalService;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato:");
        System.out.print("Número: ");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate data = LocalDate.parse(sc.nextLine(), fmt);
        System.out.print("Valor do contrato: ");
        double totalValue = sc.nextDouble();
        System.out.print("Número de parcelas: ");
        int numeroParcela = sc.nextInt();

        Contract contrato = new Contract(numero, data, totalValue);

        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contrato, numeroParcela);
        for (Installment installments : contrato.getInstallment()) {
            System.out.println(installments);
        }

        sc.close();

    }
}
