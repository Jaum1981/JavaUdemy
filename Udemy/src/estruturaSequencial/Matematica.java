package estruturaSequencial;

public class Matematica {
    public static void main(String[] args) {

        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);

        System.out.println("Raiz quadrada de " + x + ": " + A);
        System.out.println("Raiz quadrada de " + y + ": " + B);
        System.out.println("Raiz quadrada de 25: " + C);

        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);

        System.out.println(x + "elevado a" + y + "= " + A);
        System.out.println(x + "elevado a 2.0 = " + B);
        System.out.println("5.0 elevado a 2.0 = " + C);

        A = Math.abs(x);
        B = Math.abs(z);
        System.out.println("Valor absoluto de " + x + "= " + A);
        System.out.println("Valor absoluto de " + z + "= " + B);

        //Fórmula de Bhaskara:

        double a, b, c, x1, x2;
        a = -3.0;
        b = 2.0;
        c = 5.0;

        double delta = Math.pow(b, 2.0) - 4 * a * c;

        x1 = -b + Math.sqrt(delta) / (2 * a);
        x2 = -b - Math.sqrt(delta) / (2 * a);

        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }
}
