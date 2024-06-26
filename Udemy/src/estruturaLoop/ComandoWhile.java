package estruturaLoop;
import java.util.Scanner;

public class ComandoWhile {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int soma = a;
		while (a != 0){
			a = sc.nextInt();
			soma += a;
		}
		
		System.out.println(soma);
		
		sc.close();
	}
}
