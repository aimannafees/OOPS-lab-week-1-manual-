public class Triangle {
    private Line line1;
    private Line line2;
    private Line line3;

    // Default Constructor
    public Triangle() {
        this.line1 = new Line(0, 0, 0, 1);
        this.line2 = new Line(0, 1, 1, 0);
        this.line3 = new Line(1, 0, 0, 0);
    }

    // Constructed from 3 Point objects (creates Line objects internally)
    public Triangle(Point p1, Point p2, Point p3) {
        this.line1 = new Line(p1, p2);
        this.line2 = new Line(p2, p3);
        this.line3 = new Line(p3, p1);
    }

    // Constructed from 3 Line objects
    public Triangle(Line l1, Line l2, Line l3) {
        this.line1 = new Line(l1);
        this.line2 = new Line(l2);
        this.line3 = new Line(l3);
    }

    // Getters
    public Line getLine1() { return new Line(line1); }
    public Line getLine2() { return new Line(line2); }
    public Line getLine3() { return new Line(line3); }

    public double getPerimeter() {
        return line1.getLength() + line2.getLength() + line3.getLength();
    }

    @Override
    public String toString() {
        return "Triangle[\n  " + line1 + ",\n  " + line2 + ",\n  " + line3 + "\n]";
    }
}