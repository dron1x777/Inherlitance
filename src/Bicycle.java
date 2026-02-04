public class Bicycle extends Transport {
    public Bicycle(double speed, double capacity) {
        super(speed, capacity);
    }

    String ringBell(String word) {
        if (word.equals("ring")) {
            return "bell is ringing";
        }
        return "bell is not ringing";
    }

}
