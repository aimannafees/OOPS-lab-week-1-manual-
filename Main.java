public class Main {
public static void main(String[] args) {
System.out.println("== Car 1 ==");
Car car1 = new Car();
car1.setDetails("Toyota", "Red");
car1.drive();
car1.startEngine();
car1.drive();
car1.moveFast();
car1.moveLeft();
car1.toggleAutopilot();
car1.checkSeatBelt(false);
car1.autoWiper(true);
car1.voiceCommand("drive");
car1.calculateRange();
car1.displayState();
}
}