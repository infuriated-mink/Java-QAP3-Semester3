package Problem3;

// The EquilateralTriangle class is a subclass of the Triangle class and inherits all its methods and fields
public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(double side) {
        super(side, side, side);
        this.name = "EquilateralTriangle";
    }
}