public class Technique {
   private String name;
   private double version;
   private String brand;

   public Technique(String name, double version, String brand) {
       this.name = name;
       this.version = version;
       this.brand = brand;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    String turnOnOff(String thing) {
       thing.trim();
       if (thing.equalsIgnoreCase("true")) {
           return name + " is on";
       }
       return name + " is off";
    }

    @Override
    public String toString() {
        return "Technique{" +
                "name='" + name + '\'' +
                ", version=" + version +
                ", brand='" + brand + '\'' +
                '}';
    }
}
