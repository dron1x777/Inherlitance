
public class Main {
    public static void main(String[] args) {
        Mother mother = new Mother("Somebody", 37, "green");
        System.out.println(mother.getNamed());
        System.out.println(mother);
        Daughter daughter = new Daughter("somebody123", 14, "black", 168.5, "white");
        System.out.println(daughter.getNamed());
        System.out.println(daughter);
    }
}