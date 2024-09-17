package comportamentoMemoria;

import java.util.Scanner;

import introPOO.entitie.Product;

public class ArrayParte2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de produtos que deseja cadastrar:");
        int qtd = sc.nextInt();
        Product[] vect = new Product[qtd];

        for (int i = 0; i < qtd; i++) {
            sc.nextLine();
            System.out.print("Digite o nome do produto: ");
            String name = sc.nextLine();
            System.out.print("Digite o preço do produto: ");
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }

        double sum = 0.0;
        for (int i = 0; i < qtd; i++) {
            sum += vect[i].getPrice();
        }

        System.out.println(sum);

        sc.close();
    }
}
