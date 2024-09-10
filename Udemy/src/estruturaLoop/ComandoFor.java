package estruturaLoop;

import java.util.Scanner;

public class ComandoFor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int soma = 0;
        for (int i = 0; i < a; i++) {
            soma += a;
            a = sc.nextInt();
        }

        System.out.println(soma);
        sc.close();
    }

}
