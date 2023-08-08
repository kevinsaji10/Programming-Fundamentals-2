public class ComparablePoint {
    public int compareTo(Point2D p) {
        Point2D origin = new Point2D();
        if (this.distance(origin) > p.distance(origin)) {
            return 1;
        } else if (this.distance(origin) < p.distance(origin)) {
            return -1;
        } else {
            return 0;
        }
    }
}