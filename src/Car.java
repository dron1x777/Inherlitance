public class Car extends Transport {

    public Car(double speed, double capacity) {
        super(speed, capacity);
    }

    String turnOnRadio(boolean turnOn) {
        if (turnOn == true) {
            return "Transport's radio is turning on";
        }
        return  "Transport's radio is turning off";
    }
}
