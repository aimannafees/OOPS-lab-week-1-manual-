public class Main {
    public static void main(String[] args) {
        // Create initial vertices
        Point v1 = new Point(1, 1);
        Point v2 = new Point(5, 1);
        Point v3 = new Point(3, 4);

        // Null/Default constructor
        Triangle t1 = new Triangle();
        System.out.println("Null const:");
        t1.show();

        // Parameterized constructor
        Triangle t2 = new Triangle(v1, v2, v3);
        System.out.println("Para const:");
        t2.show();

        // Copy constructor
        Triangle t3 = new Triangle(t2);
        System.out.println("Copy const:");
        t3.show();

        // Setter
        Point v4 = new Point(2, 2);
        Point v5 = new Point(6, 2);
        Point v6 = new Point(4, 5);
        t1.set(v4, v5, v6);
        System.out.println("After setter:");
        t1.show();

        // Getters
        System.out.println("Getter v1: " + t2.getV1());
        System.out.println("Getter v2: " + t2.getV2());
        System.out.println("Getter v3: " + t2.getV3());

        // toString
        System.out.println("To string:");
        System.out.println(t2.toString());
    }
}