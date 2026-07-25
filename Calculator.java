public class Calculator {
    private double num1;
    private double num2;

    // Default constructor
    public Calculator() {
        this.num1 = 0;
        this.num2 = 0;
    }

    // Parameterized constructor (accepts numbers)
    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Setters and getters
    public void set(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return this.num1;
    }

    public double getNum2() {
        return this.num2;
    }

    // Basic operations
    public double add() {
        return this.num1 + this.num2;
    }

    public double subtract() {
        return this.num1 - this.num2;
    }

    public double multiply() {
        return this.num1 * this.num2;
    }

    public double divide() {
        if (this.num2 == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return 0;
        }
        return this.num1 / this.num2;
    }

    // New Operation 1: Modulus
    public double modulus() {
        if (this.num2 == 0) {
            System.out.println("Error: Cannot compute modulus with zero.");
            return 0;
        }
        return this.num1 % this.num2;
    }

    // New Operation 2: Power
    public double power() {
        return Math.pow(this.num1, this.num2);
    }

    // Display
    public void show() {
        System.out.println("num1 = " + this.num1 + ", num2 = " + this.num2);
    }
}