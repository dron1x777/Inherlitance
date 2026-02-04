
public class Main {
    public static void main(String[] args) {
        Car car = new Car(230,50);
        System.out.println(car.getCapacity());
        System.out.println(car.getSpeed());
        car.move();
        System.out.println(car.turnOnRadio(true));

        Bicycle bicycle = new Bicycle(35,0);
        System.out.println(bicycle.getCapacity());
        System.out.println(bicycle.getSpeed());
        bicycle.move();
        System.out.println(bicycle.ringBell("ring"));

        Bus bus = new Bus(100,70);
        System.out.println(bus.getCapacity());
        System.out.println(bus.getSpeed());
        bus.move();
        System.out.println(bus.openDoors("Open"));


    }
}