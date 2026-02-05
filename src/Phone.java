public class Phone extends Technique{
    private int phoneNumber;

    public Phone(String name, double version, String brand, int phoneNumber) {
        super(name, version, brand);
        this.phoneNumber = phoneNumber;
    }

    void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public long getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    String turnOnOff(String thing) {
        if (thing.equalsIgnoreCase("12345")) {
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
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
