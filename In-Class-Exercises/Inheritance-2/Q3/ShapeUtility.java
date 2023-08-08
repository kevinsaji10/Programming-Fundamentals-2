import java.util.*;

public class ShapeUtility {
    public static Octagon getLargestOctagon(ArrayList<Shape> shapeList) {
        if (shapeList == null || shapeList.size() == 0) {
            return null;
        }
        Shape largest = shapeList.get(0);
        for (Shape o : shapeList) {
            if (o instanceof Shape && o.getArea() > largest.getArea()) {
                largest = o;
            }
        }
        return (Octagon) largest;
    }

    public static ArrayList<Shape> getAllNonRectangles(ArrayList<Shape> shapeList) {
        if (shapeList == null) {
            return new ArrayList<>();
        }
        ArrayList<Shape> shapeArray = new ArrayList<>();

        for (Shape s : shapeList) {
            if (!(s instanceof Rectangle)) {
                shapeArray.add(s);
            }
        }
        return shapeArray;
    }

    public static ArrayList<Square> getAllSquareWithMinArea(ArrayList<Shape> shapeList, int minArea) {
        if (shapeList == null) {
            return new ArrayList<Square>();
        }

        ArrayList<Square> squareArray = new ArrayList<>();
        for (Shape s : shapeList) {
            if (s instanceof Square && s.getArea() >= minArea) {
                squareArray.add((Square) s);
            }
        }
        return squareArray;

    }

    public static ArrayList<Rectangle> getAllRectangleWithMinLength(ArrayList<Shape> shapeList, int minLength) {
        if (shapeList == null) {
            return new ArrayList<Rectangle>();
        }

        ArrayList<Rectangle> rectangleArray = new ArrayList<>();
        for (Shape s : shapeList) {
            if (s instanceof Rectangle) {
                Rectangle r = (Rectangle) s;
                if (r.getLength() >= minLength) {
                    rectangleArray.add(r);
                }

            }
        }
        return rectangleArray;

    }
}
