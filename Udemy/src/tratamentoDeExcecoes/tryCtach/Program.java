package tratamentoDeExcecoes.tryCtach;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        method1();

        System.out.println("Fim do programa");

    }

    public static void method1(){
        System.out.println("Method 1 START");
        method2();
        System.out.println("method 1 END");
    }

    public static void method2(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Method 2 START");
        try{
        String[] nomes = sc.nextLine().split(" ");
        int pos = sc.nextInt();
        System.out.println(nomes[pos]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index inxistente");
            e.printStackTrace();
        }
        catch(InputMismatchException e){
            System.out.println("Erro de input");
        }
        System.out.println("method 2 END");
        sc.close();
    }
}
