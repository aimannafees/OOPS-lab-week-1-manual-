public class Triangle {
    private Point v1;
    private Point v2;
    private Point v3;

    // Default / Null Constructor
    public Triangle() {
        this.v1 = new Point();
        this.v2 = new Point();
        this.v3 = new Point();
    }

    // Parameterized Constructor
    public Triangle(Point v1, Point v2, Point v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    // Copy Constructor (Deep Copy)
    public Triangle(Triangle obj) {
        this.v1 = new Point(obj.v1);
        this.v2 = new Point(obj.v2);
        this.v3 = new Point(obj.v3);
    }

    // Setters & Getters
    public void set(Point v1, Point v2, Point v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public Point getV1() { return this.v1; }
    public Point getV2() { return this.v2; }
    public Point getV3() { return this.v3; }

    public void show() {
        System.out.println("V1: " + this.v1);
        System.out.println("V2: " + this.v2);
        System.out.println("V3: " + this.v3);
    }

    @Override
    public String toString() {
        return "Triangle [V1=" + v1 + ", V2=" + v2 + ", V3=" + v3 + "]";
    }
}