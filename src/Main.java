import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] persons = {
                new Singer(),
                new Dancer(),
                new Programmer()
        };
        for (Person person : persons) {
            System.out.println(person.walk());
        }

    }
}