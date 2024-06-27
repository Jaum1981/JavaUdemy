package estruturaLoop;
import java.util.Scanner;

public class ComandoDoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int soma = a;
		char continua;

		do{

			a = sc.nextInt();
			soma += a;
			System.out.println("Continuar?(s/n)");
			continua = sc.next().charAt(0);
		}while(continua != 'n');

		System.out.println(soma);

		sc.close();
	}

}
