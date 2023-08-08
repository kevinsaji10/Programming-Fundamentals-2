
import java.lang.Math;

public class Octagon implements Shape {
    private double side;

    public Octagon(double side) {
        this.side = side;
    }

    public double getArea() {
        return this.side * this.side * (2 + 2 * Math.sqrt(2));
    }

    public double getPerimeter() {
        return 8 * this.side;
    }

    public double getSide() {
        return this.side;
    }

    @Override
    public String toString() {
        return "size: " + this.side + " area: " + this.getArea() + " perimeter: " + this.getPerimeter();
    }

}
