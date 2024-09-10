package comportamentoMemoria;

import java.util.Scanner;

public class ArrayParte1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o numero de pessoas para fazer a media da altura: ");
        int qtd = sc.nextInt();
        double[] vect = new double[qtd];
        double sum = 0.0;

        System.out.println("Digite a altura de cada um: ");
        for (int i = 0; i < qtd; i++) {
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }

        double averageHeight = sum / qtd;

        System.out.println("Average height is: " + averageHeight);
        sc.close();
    }
}
