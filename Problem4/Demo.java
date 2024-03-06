package Problem4;

import Problem3.Shape;
import Problem3.Circle;
import Problem3.Ellipse;
import Problem3.Triangle;
import Problem3.EquilateralTriangle;

public class Demo {
    public static void scaleAll(Scalable[] scalables, double factor) {
        for (Scalable scalable : scalables) {
            scalable.scale(factor);
        }
    }

    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(5);
        shapes[1] = new Ellipse(7, 3);
        shapes[2] = new Triangle(3, 4, 5);
        shapes[3] = new EquilateralTriangle(6);

        // Print the shapes before scaling
        System.out.println("Before scaling:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        // Scale all shapes by a factor of 2
        scaleAll((Scalable[]) shapes, 2);

        System.out.println("\nAfter scaling:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}