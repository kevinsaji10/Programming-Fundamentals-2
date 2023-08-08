public class Box {
    private int length;
    private int breadth;
    private int height;

    public Box(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Object clone() {
        return new Box(length, breadth, height);
    }

    public boolean equals(Object another) {
        if (another instanceof Box) {
            Box b = (Box) another;
            if (b.height == this.height && b.length == this.length && b.breadth == this.breadth) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "height: " + this.height + " breadth: " + this.breadth + " length: " + this.length;
    }

}
