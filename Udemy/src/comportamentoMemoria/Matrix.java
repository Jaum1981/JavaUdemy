package comportamentoMemoria;

import java.util.Scanner;

/*
Fazer um programa para ler dois números inteiros M e N, e depois ler
uma matriz de M linhas por N colunas contendo números inteiros,
podendo haver repetições. Em seguida, ler um número inteiro X que
pertence à matriz. Para cada ocorrência de X, mostrar os valores à
esquerda, acima, à direita e abaixo de X, quando houver, conforme
exemplo.
 */

/*
Example
3 4

10 8 15 12
21 11 23 8
14 5 13 19

8

Position 0,1:
Left: 10
Right: 15
Down: 11
Position 1,3:
Left: 23
Up: 12
Down: 19
*/

public class Matrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int linha = sc.nextInt();
        int coluna = sc.nextInt();

        int[][] matrix = new int[linha][coluna];

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int numero = sc.nextInt();
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                if (matrix[i][j] == numero) {
                    System.out.println("Position: " + i + "," + j);
                    if (j > 0) {
                        System.out.println("Left: " + matrix[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + matrix[i - 1][j]);
                    }
                    if (j < coluna - 1) {
                        System.out.println("Right: " + matrix[i][j + 1]);
                    }
                    if (i < linha - 1) {
                        System.out.println("Down: " + matrix[i + 1][j]);
                    }
                }
            }
        }
        sc.close();
    }
}
