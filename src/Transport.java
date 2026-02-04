public class Transport {
    private double speed;
    private double capacity;
    public Transport(double speed, double capacity) {
        this.speed = speed;
        this.capacity = capacity;
    }
    public double getSpeed() {
        return speed;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }
    public double getCapacity() {
        return capacity;
    }
    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }
    public String move() {
        return "Transport is moving";
    }
}
