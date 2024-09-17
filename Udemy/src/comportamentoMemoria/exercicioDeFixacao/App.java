package comportamentoMemoria.exercicioDeFixacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        List<Funcionario> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("How many employees will be registered? ");
        int qtd = sc.nextInt();

        for (int i = 0; i < qtd; i++) {
            sc.nextLine();
            System.out.println("Enter the informationa about the employee: ");
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            double salary = sc.nextDouble();
            // Funcionario func = new Funcionario(id, name, salary);
            // list.add(id, name, salary);

            list.add(new Funcionario(id, name, salary));
        }

        System.out.println("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        Integer pos = position(list, id);
        if (pos == null) {
            System.out.println("Id now found");
        } else {
            System.out.println("Enter the percentage: ");
            double percentage = sc.nextDouble();
            list.get(pos).increaseSalary(percentage);
            System.out.println("New salary: " + list.get(pos));
        }

        sc.close();
    }

    public static Integer position(List<Funcionario> list, int id) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }

}
