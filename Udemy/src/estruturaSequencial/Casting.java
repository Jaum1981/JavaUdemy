package estruturaSequencial;

public class Casting {

    public static void main(String[] args) {
        int a, b;
        double resultado;

        a = 5;
        b = 2;

        resultado = a / b; //2.0
        //casting:
        resultado = (double) a / b; //2.5

        resultado = 2.0;
        //a = resultado; erro
        a = (int) resultado;


        System.out.println(resultado);
    }

}
