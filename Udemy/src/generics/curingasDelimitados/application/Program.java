package generics.curingasDelimitados.application;

import java.util.ArrayList;
import java.util.List;

import generics.curingasDelimitados.entities.Circle;
import generics.curingasDelimitados.entities.Rectangle;
import generics.curingasDelimitados.entities.Shape;

public class Program {
    public static void main(String[] args) {

        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(5.0));

        System.out.println("Total area: " + totalArea(myShapes));
        System.out.println("Total area: " + totalArea(myCircles));

    }

    public static double totalArea(List<? extends Shape> list) { // que desgraca é essa
        double sum = 0.0;
        for (Shape shape : list) {
            sum += shape.area();
        }
        return sum;
    }

}
