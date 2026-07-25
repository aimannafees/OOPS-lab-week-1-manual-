public class CalculatorMain {
    public static void main(String[] args) {
        // Normal case (10 and 3)
        Calculator calc = new Calculator(10, 3);
        calc.show();

        System.out.println("Add: " + calc.add());
        System.out.println("Subtract: " + calc.subtract());
        System.out.println("Multiply: " + calc.multiply());
        System.out.println("Divide: " + calc.divide());
        System.out.println("Modulus: " + calc.modulus());
        System.out.println("Power: " + calc.power());

        // Edge case (Power with 0 exponent)
        Calculator edgeCalc = new Calculator(5, 0);
        edgeCalc.show();
        System.out.println("Power edge case: " + edgeCalc.power());
    }
}