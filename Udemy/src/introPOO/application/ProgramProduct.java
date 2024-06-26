package introPOO.application;

import java.util.Locale;
import java.util.Scanner;

import introPOO.entitie.Product;

public class ProgramProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Product product1;

        product1 = new Product();

        System.out.println("Enter the name of the product: ");
        product1.setName(sc.nextLine());
        System.out.println("Price: ");
        product1.setPrice(sc.nextDouble());
        System.out.println("Quantity in stock: ");
        product1.setQuantity(sc.nextInt());

        System.out.println(product1);

        System.out.println("Enter the number of products to be added: ");
        product1.addProduct(sc.nextInt());
        System.out.println(product1);

        System.out.println("Enter the number of products to be removed: ");
        product1.removeProduct(sc.nextInt());
        System.out.println(product1);
        sc.close();
    }
}
