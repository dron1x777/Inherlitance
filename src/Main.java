
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Something", 15);
        animal.eat();
        animal.sleep();
        Dog dog = new Dog("Shepard", 6);
        dog.setDomestic(true);
        dog.setCanBark(true);
        System.out.println(dog.isDomestic());
        System.out.println(dog.isCanBark());
        dog.sleep();
        Cat cat = new Cat("Barsik", 2);
        cat.setCanMeow(true);
        cat.setClawsLength(49);
        System.out.println(cat.getClawsLength());
        System.out.println(cat.getCanMeow());
        cat.eat();
    }
}