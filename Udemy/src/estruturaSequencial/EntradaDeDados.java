package estruturaSequencial;

import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//		String x;
//		x = sc.next();
//		System.out.println("Voce digitou: " + x);
//		
//		int y;
//		y = sc.nextInt();
//		System.out.println("Voce digitou: " + y);
//		
//		double z;
//		z = sc.nextDouble(); //digitar com "," mas imprime com . na tela
//		System.out.println("Voce digitou: " + z);
//		
//		char w;
//		w = sc.next().charAt(0);
//		System.out.println("Voce digitou: "+ w);

        String s1, s2, s3;

        // os outros next deixam uma quebra de linha na memoria, logo se tiver um
        // nextint antes de um
        // nextline, o nexline consumirar a %n do nextInt
        // para limpar o buffer é só colocar um nexline logo apos o nextint ou outros

        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Dados digitados: ");
        System.out.println("s1:" + s1);
        System.out.println("s2:" + s2);
        System.out.println("s3:" + s3);

        sc.close();
    }
}
