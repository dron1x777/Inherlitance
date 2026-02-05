
public class Main {
    public static void main(String[] args) {
        Technique technique = new Technique("technique", 13.05, "XBOX");
        System.out.println(technique);
        System.out.println(technique.turnOnOff("false"));
        SmartWatch smartWatch = new SmartWatch("SmartWatch", 5.04, "i dont know", true);
        System.out.println(smartWatch);
        System.out.println(smartWatch.turnOnOff("true"));
        Phone phone = new Phone("phone", 16, "Iphone", 354874388);
        System.out.println(phone);
        System.out.println(phone.turnOnOff("y5gtv4rc3"));
        Computer computer = new Computer("computer", 12.5, "ACER", true);
        System.out.println(computer);
        System.out.println(computer.turnOnOff("123"));
    }
}