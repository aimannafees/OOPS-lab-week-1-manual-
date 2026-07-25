public class Car {
    private String brand;
    private String color;
    private int speed;
    private boolean engineOn;
    private double fuelLevel;
    private String direction;
    private boolean autopilotEnabled;
    private boolean seatBeltFastened;
    private boolean wipersOn;
    private boolean solarChargingEnabled;
    private double fuelEfficiency; // km travelled per unit of fuel

    public Car() {
        this.brand = "Unknown";
        this.color = "Unknown";
        this.speed = 0;
        this.engineOn = false;
        this.fuelLevel = 100.0;
        this.direction = "straight";
        this.autopilotEnabled = false;
        this.seatBeltFastened = false;
        this.wipersOn = false;
        this.solarChargingEnabled = false;
        this.fuelEfficiency = 15.0;
    }

    public void setDetails(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public void startEngine() {
        if (!this.engineOn) {
            this.engineOn = true;
            System.out.println(this.brand + "'s engine started.");
        } else {
            System.out.println(this.brand + "'s engine is already running.");
        }
    }

    // rule: stopping the engine always resets speed to zero
    public void stopEngine() {
        this.engineOn = false;
        this.speed = 0;
        System.out.println(this.brand + "'s engine stopped. Speed reset to 0.");
    }

    // rule: cannot accelerate while the engine is off
    public void drive() {
        if (!this.engineOn) {
            System.out.println(this.brand + " cannot drive - engine is off.");
            return;
        }
        this.speed += 10;
        this.fuelLevel = Math.max(0, this.fuelLevel - 1);
        System.out.println(this.brand + " is driving at " + this.speed + " km/h.");
    }

    public void moveFast() {
        if (!this.engineOn) {
            System.out.println(this.brand + " cannot accelerate - engine is off.");
            return;
        }
        this.speed += 20;
        System.out.println(this.brand + " speeds up to " + this.speed + " km/h.");
    }

    // rule: speed should never become negative
    public void moveSlow() {
        this.speed = Math.max(0, this.speed - 10);
        System.out.println(this.brand + " slows down to " + this.speed + " km/h.");
    }

    public void moveLeft() {
        this.direction = "left";
        System.out.println(this.brand + " is turning left.");
    }

    public void moveRight() {
        this.direction = "right";
        System.out.println(this.brand + " is turning right.");
    }

    // creative / "thrilling" feature, still logically modelled
    public void toggleAutopilot() {
        if (!this.engineOn) {
            System.out.println(this.brand + " cannot enable autopilot - engine is off.");
            return;
        }
        this.autopilotEnabled = !this.autopilotEnabled;
        System.out.println(this.brand + "'s autopilot is now "
                + (this.autopilotEnabled ? "ON" : "OFF") + ".");
    }

    // if no seat belt, a siren goes off
    public void checkSeatBelt(boolean fastened) {
        this.seatBeltFastened = fastened;
        if (!this.seatBeltFastened) {
            System.out.println(this.brand + ": no seat belt detected - siren activated!");
        } else {
            System.out.println(this.brand + ": seat belt fastened.");
        }
    }

    // when water/rain falls, wipers turn on automatically
    public void autoWiper(boolean isRaining) {
        this.wipersOn = isRaining;
        if (isRaining) {
            System.out.println(this.brand + ": rain detected - wipers turned on automatically.");
        } else {
            System.out.println(this.brand + ": no rain - wipers off.");
        }
    }

    // basic voice control
    public void voiceCommand(String command) {
        System.out.println(this.brand + " received voice command: \"" + command + "\"");
        switch (command.toLowerCase()) {
            case "start engine":
                startEngine();
                break;
            case "stop engine":
                stopEngine();
                break;
            case "drive":
                drive();
                break;
            default:
                System.out.println(this.brand + ": command not recognized.");
        }
    }

    // how far the car can travel based on current fuel
    public double calculateRange() {
        double range = this.fuelLevel * this.fuelEfficiency;
        System.out.println(this.brand + " can travel approximately " + range + " km with current fuel.");
        return range;
    }

    public void toggleSolarCharging() {
        this.solarChargingEnabled = !this.solarChargingEnabled;
        System.out.println(this.brand + "'s solar charging is now "
                + (this.solarChargingEnabled ? "enabled" : "disabled") + ".");
    }

    // solar panels generate electricity to top up fuel/battery level
    public void generateSolarPower() {
        if (this.solarChargingEnabled) {
            this.fuelLevel = Math.min(100, this.fuelLevel + 5);
            System.out.println(this.brand + "'s solar panels generated extra charge. Fuel level: "
                    + this.fuelLevel);
        } else {
            System.out.println(this.brand + "'s solar charging is disabled.");
        }
    }

    public void displayState() {
        System.out.println("---- Car state ----");
        System.out.println("Brand: " + this.brand);
        System.out.println("Color: " + this.color);
        System.out.println("Speed: " + this.speed + " km/h");
        System.out.println("Engine on: " + this.engineOn);
        System.out.println("Fuel level: " + this.fuelLevel);
        System.out.println("Direction: " + this.direction);
        System.out.println("Autopilot: " + this.autopilotEnabled);
        System.out.println("Seat belt fastened: " + this.seatBeltFastened);
        System.out.println("Wipers on: " + this.wipersOn);
        System.out.println("Solar charging enabled: " + this.solarChargingEnabled);
        System.out.println("--------------------");
    }
}