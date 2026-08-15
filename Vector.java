public class Vector {
    private int dx;
    private int dy;

    // Direct components constructor
    public Vector(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    // Vector constructed from two Points: (end - start)
    public Vector(Point start, Point end) {
        this.dx = end.getX() - start.getX();
        this.dy = end.getY() - start.getY();
    }

    public int getDx() { return dx; }
    public int getDy() { return dy; }

    public double getMagnitude() {
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString() {
        return "Vector<" + dx + ", " + dy + ">";
    }
}