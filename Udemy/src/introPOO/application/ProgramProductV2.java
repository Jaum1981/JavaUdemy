package introPOO.application;

import java.util.Scanner;

import introPOO.entitie.ProductV2;

public class ProgramProductV2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();
        ProductV2 product = new ProductV2(name, price, quantity);

        System.out.println(product);

        sc.close();
    }
}
