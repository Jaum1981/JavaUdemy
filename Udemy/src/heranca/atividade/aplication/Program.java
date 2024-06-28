package heranca.atividade.aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import heranca.atividade.entities.Employee;
import heranca.atividade.entities.OutsourcedEmployee;

public class Program {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int qtd = sc.nextInt();

        List<Employee> list = new ArrayList<>();

        for(int i=0; i<qtd; i++) {
            System.out.print("Employee #" + (i+1));
            System.out.print("Outsourced employee?(y/n)");
            char opc = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.err.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            if(opc == 'y'){
                System.out.print("Additional charge: ");
                double addicionalCharge = sc.nextDouble();
                list.add(new OutsourcedEmployee(name, hours, valuePerHour, addicionalCharge));
            }else{
                list.add(new Employee(name, hours, valuePerHour));
            }
        }
        System.err.println();
        System.out.println("PAYMENTS: ");
        for (Employee emp : list) {
            System.out.println(emp.getName() + " - $" + String.format("%.2f", emp.payment()));
        }

        sc.close();

    }
        
   
}
