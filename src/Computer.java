public class Computer extends Technique {
    private boolean haveMouseOrKeyboard;

    public Computer(String name, double version, String brand, boolean waterResistant) {
        super(name, version, brand);
        this.haveMouseOrKeyboard = waterResistant;
    }

    void setHaveMouseOrKeyboard(boolean haveMouseOrKeyboard) {
        this.haveMouseOrKeyboard = haveMouseOrKeyboard;
    }
    boolean getMouseOrKeyboard() {
        return haveMouseOrKeyboard;
    }

    @Override
    String turnOnOff(String thing) {
        if (thing.equalsIgnoreCase("123")) {
            return getName() + "is on";
        }
        return getName() + "is off";
    }

    @Override
    public String toString() {
        return "Technique{" +
                "name='" + getName() + '\'' +
                ", version=" + getVersion() +
                ", brand='" + getBrand() + '\'' +
                ", waterResistant=" + haveMouseOrKeyboard +
                '}';
    }
}
