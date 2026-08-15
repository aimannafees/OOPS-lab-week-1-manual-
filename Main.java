public class Main {
    public static void main(String[] args) {
        // 1. Create Points
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 4);
        Point p3 = new Point(3, 0);

        // 2. Subtract points to make a Vector
        Vector v1 = p1.vectorTo(p2);
        System.out.println("Vector P1 -> P2: " + v1);
        System.out.println("Vector Magnitude: " + v1.getMagnitude());

        // 3. Construct Lines from Points
        Line l1 = new Line(p1, p2);
        Line l2 = new Line(p2, p3);
        Line l3 = new Line(p3, p1);

        // 4. Calculate Line Intersection
        Line lineA = new Line(0, 0, 4, 4);
        Line lineB = new Line(0, 4, 4, 0);
        Point intersect = lineA.intersection(lineB);
        System.out.println("Line Intersection Point: " + intersect);

        // 5. Construct Triangle using Lines (composed of Points)
        Triangle triangleFromLines = new Triangle(l1, l2, l3);
        System.out.println("\n--- Triangle from Lines ---");
        System.out.println(triangleFromLines);
        System.out.println("Perimeter: " + triangleFromLines.getPerimeter());

        // 6. Construct Triangle directly from Points
        Triangle triangleFromPoints = new Triangle(p1, p2, p3);
        System.out.println("\n--- Triangle from Points ---");
        System.out.println(triangleFromPoints);
    }
}