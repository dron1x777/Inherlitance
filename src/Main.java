
public class Main {
    public static void main(String[] args) {
        Country country = new Country("Kyrgyzstan", 6135226, 4564, "Kyrgyz");
        Country country1 = new Country("Kazahstan", 14536273, 28464, "Kazah");
        Country country2 = new Country("Tadjikistan", 5564733, 3455, "Tadjik");
        int[] km = {country1.getKm(), country2.getKm(), country.getKm()};
        String[] name = {country1.getName(), country2.getName(), country.getName()};
        System.out.println(Country.getMax(km, name));

    }
}