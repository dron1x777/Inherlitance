public class SmartWatch extends Technique {
    private boolean waterResistant;

    public SmartWatch(String name, double version, String brand,boolean waterResistant) {
        super(name, version, brand);
        this.waterResistant = waterResistant;
    }

    void setWaterResistant(boolean waterResistant) {
        this.waterResistant = waterResistant;
    }
    boolean getWaterResistant() {
        return waterResistant;
    }

    @Override
    String turnOnOff(String thing) {
        return super.turnOnOff(thing);
    }

    @Override
    public String toString() {
        return "Technique{" +
                "name='" + getName() + '\'' +
                ", version=" + getVersion() +
                ", brand='" + getBrand() + '\'' +
                ", waterResistant=" + waterResistant +
                '}';
    }
}
