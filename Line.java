public class Line {
    private Point start;
    private Point end;

    // Default Constructor
    public Line() {
        this.start = new Point(0, 0);
        this.end = new Point(0, 0);
    }

    // Constructor using Point objects
    public Line(Point start, Point end) {
        this.start = new Point(start);
        this.end = new Point(end);
    }

    // Constructor using raw coordinates
    public Line(int x1, int y1, int x2, int y2) {
        this.start = new Point(x1, y1);
        this.end = new Point(x2, y2);
    }

    // Copy Constructor
    public Line(Line other) {
        this.start = new Point(other.start);
        this.end = new Point(other.end);
    }

    // Getters and Setters
    public Point getStart() { return new Point(start); }
    public void setStart(Point start) { this.start = new Point(start); }
    public Point getEnd() { return new Point(end); }
    public void setEnd(Point end) { this.end = new Point(end); }

    public double getLength() {
        return start.distanceTo(end);
    }

    // Converts line segment to a direction Vector
    public Vector toVector() {
        return start.vectorTo(end);
    }

    // Line-Line Intersection algorithm
    public Point intersection(Line other) {
        double x1 = this.start.getX(), y1 = this.start.getY();
        double x2 = this.end.getX(),   y2 = this.end.getY();
        double x3 = other.start.getX(), y3 = other.start.getY();
        double x4 = other.end.getX(),   y4 = other.end.getY();

        double denom = (x1 - x2) * (y3 - y4) - (y1 - y2) * (x3 - x4);
        if (denom == 0) {
            return null; // Parallel or overlapping lines
        }

        double intersectX = ((x1 * y2 - y1 * x2) * (x3 - x4) - (x1 - x2) * (x3 * y4 - y3 * x4)) / denom;
        double intersectY = ((x1 * y2 - y1 * x2) * (y3 - y4) - (y1 - y2) * (x3 * y4 - y3 * x4)) / denom;

        return new Point((int) Math.round(intersectX), (int) Math.round(intersectY));
    }

    @Override
    public String toString() {
        return "Line[" + start + " -> " + end + "]";
    }
}