public class JedliksToyCar {

    // In order for the drive() method to be able to modify different variables, and for other methods to be able to read these        values, the variables must be class attributes (instance variables), and not local to a method.

    private int distanceDriven = 0;         // Tracks how far the car has driven
    private int batteryPercentage = 100;    // Represents the remaining battery percentage

    // Static method that creates and returns a new toy car instance
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    // Returns a string with the total distance the car has driven so far
    public String distanceDisplay() {
        return "Driven " + distanceDriven + " meters";
    }

    // Returns the battery level as a string.
    // If the battery is empty, returns a specific message.
    public String batteryDisplay() {
        if (batteryPercentage == 0) {
            return "Battery empty";
        } else {
            return "Battery at " + batteryPercentage + "%";
        }
    }

    // Simulates driving the toy car.
    // Each drive call consumes 1% battery and increases distance by 20 meters.
    // If the battery is empty, driving is not possible and a message is shown.
    public void drive() {
        if (batteryPercentage > 0) {
            distanceDriven += 20;
            batteryPercentage -= 1;
        } else {
            System.out.println("Battery empty");
        }
    }
}
