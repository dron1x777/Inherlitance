public class Country {
   private String name;
   private int population;
   private int km;
   private String language;

    public Country(String name, int population, int km, String language) {
        this.name = name;
        this.population = population;
        this.km = km;
        this.language = language;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getPopulation() {return population;}
    public void setPopulation(int population) {this.population = population;}
    public int getKm() {return km;}
    public void setKm(int km) {this.km = km;}
    public String getLanguage() {return language;}
    public void setLanguage(String language) {this.language = language;}

    static String getMax (int[] km, String[] name) {
        int max = km[0];
        String named = name[0];
        for (int i = 1; i < km.length; i++) {
            if (km[i] > max) {
                max = km[i];
                named = name[i];
            }
        }
        return named + " " + max;
    }
}
