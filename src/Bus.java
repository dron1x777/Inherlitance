public class Bus extends Transport {

    public Bus(double speed, double capacity) {
        super(speed, capacity);
    }

    String openDoors(String move) {
        if (move.equals("Open")) {
            return "doors open";
        }
        return "doors closed";
    }
}
