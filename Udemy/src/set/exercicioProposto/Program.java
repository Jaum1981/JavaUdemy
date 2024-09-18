package set.exercicioProposto;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

/*    Em um portal de cursos online, cada usuário possui um código único, representado por
      um número inteiro.
      Cada instrutor do portal pode ter vários cursos, sendo que um mesmo aluno pode se
      matricular em quantos cursos quiser. Assim, o número total de alunos de um instrutor não
      é simplesmente a soma dos alunos de todos os cursos que ele possui, pois pode haver
      alunos repetidos em mais de um curso.
      O instrutor Alex possui três cursos A, B e C, e deseja saber seu número total de alunos.
      Seu programa deve ler os alunos dos cursos A, B e C do instrutor Alex, depois mostrar a
      quantidade total e alunos dele, conforme exemplo.
 */

    public static void main(String[] args) {

        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();
        Set<Integer> C = new HashSet<>();

        System.out.println("How many students for class A?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            A.add(number);
        }

        System.out.println("How many students for class B?");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            B.add(number);
        }

        System.out.println("How many students for class C?");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            C.add(number);
        }

        Set<Integer> total = new HashSet<>(A);
        total.addAll(B);
        total.addAll(C);

        System.out.println("Total students: " + total.size());

        sc.close();

    }
    
}
