public class Point {
    private double x;
    private double y;

    // Default / Null Constructor
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    // Parameterized Constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Copy Constructor
    public Point(Point obj) {
        this.x = obj.x;
        this.y = obj.y;
    }

    // Setters & Getters
    public void set(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return this.x; }
    public double getY() { return this.y; }

    // Add & Subtract
    public Point add(Point other) {
        return new Point(this.x + other.x, this.y + other.y);
    }

    public Point sub(Point other) {
        return new Point(this.x - other.x, this.y - other.y);
    }

    // Display
    public void show() {
        System.out.println("(" + this.x + ", " + this.y + ")");
    }

    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}