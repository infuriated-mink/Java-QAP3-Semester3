package Problem3;

public class Ellipse extends Shape {
    protected double a;
    protected double b;

    // Constructor
    public Ellipse(double a, double b) {
        super("Ellipse");
        this.a = Math.max(a, b);
        this.b = Math.min(a, b);
    }

    // Getters
    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    // Approximation for the perimeter of an ellipse
    @Override
    public double getPerimeter() {
        return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
    }

    // Scale the ellipse by a factor
    @Override
    public void scale(double factor) {
        this.a *= factor;
        this.b *= factor;
    }
}