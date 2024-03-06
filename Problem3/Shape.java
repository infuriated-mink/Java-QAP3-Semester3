package Problem3;

import Problem4.Scalable;

public abstract class Shape implements Scalable {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    // Abstract methods
    public abstract double getArea();

    public abstract double getPerimeter();

    // tostring method to print the shape, area and perimeter of the shape
    @Override
    public String toString() {
        return String.format("Shape: %s, Area: %.2f, Perimeter: %.2f", name, getArea(), getPerimeter());
    }
}