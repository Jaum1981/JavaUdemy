package heranca.atividade.exercicioProposto3.aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import heranca.atividade.exercicioProposto3.entities.Company;
import heranca.atividade.exercicioProposto3.entities.Individual;
import heranca.atividade.exercicioProposto3.entities.TaxPayer;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number o tax payers: ");
        int qtdTaxPayers = sc.nextInt();
        for (int i = 0; i < qtdTaxPayers; i++) {
            System.out.println("TAX PAYER #" + (i + 1) + " data: ");
            System.out.print("Individual or comapny (i/c)? ");
            char opc = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();
            if (opc == 'i') {
                System.out.print("Health expendatures: ");
                double healtExpenditures = sc.nextDouble();

                list.add(new Individual(name, anualIncome, healtExpenditures));
            } else if (opc == 'c') {
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();

                list.add(new Company(name, anualIncome, numberOfEmployees));
            }
        }

        double sum = 0.0;
        System.out.println();
        System.out.println("TAXES PAID:");
        for (TaxPayer taxPayer : list) {
            double aux = taxPayer.tax();
            System.out.println(taxPayer.getName() + ": $ " + String.format("%.2f", aux));
            sum += aux;
        }

        System.out.println();
        System.out.println("Total Taxes: " + sum);


        sc.close();
    }
}
