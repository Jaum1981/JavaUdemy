package introPOO.application;

import introPOO.entitie.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class ProgramTriangle {
    public static void main(String[] args) {
        Triangle x, y;

        Locale.setDefault(Locale.US);

        x = new Triangle();
        y = new Triangle();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as três medidas do triangulo x:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite as três medidas do triangulo y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        Double areaX = x.area();
        Double areaY = y.area();

        System.out.printf("A área do Triangulo x é %.4f%n e do Triangulo y é %.4f%n", areaX, areaY);

        sc.close();
    }
}
