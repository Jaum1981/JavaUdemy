package heranca.atividade.exercicioProposto2.aplication;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import heranca.atividade.exercicioProposto2.entities.ImportedProduct;
import heranca.atividade.exercicioProposto2.entities.Product;
import heranca.atividade.exercicioProposto2.entities.UsedProduct;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the nuber of products: ");
        int qtdProducts = sc.nextInt();

        for(int i = 0; i<qtdProducts; i++){
            System.out.println("PRODUCT #" + (i+1));
            System.out.println("Common, used or imported (c/u/i)");
            char opc = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            switch (opc) {
                case 'c':
                    list.add(new Product(name, price));
                    break;
    
                case 'u':
                System.out.print("Manufacture date (DD/MM/YYYY)");
                String date = sc.next();
                LocalDate d01 = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new UsedProduct(name, price, d01));
                    break;
                
                case 'i':
                System.out.print("Cuson fee: ");
                double customsFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customsFee));
                    break;
            
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }

        System.out.println();
		System.out.println("ETIQUETAS DE PRECO:");
		for (Product prod : list) {
			System.out.println(prod.priceTag());
		}

        sc.close();

    }
}
