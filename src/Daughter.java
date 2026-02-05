public class Daughter extends Mother {
    private String hairColor;
    private double heigh;
    public Daughter(String name, int age, String eyeColor, double heigh, String hairColor) {
        super(name, age, eyeColor);
        this.hairColor = hairColor;
        this.heigh = heigh;
    }

    public String getHairColor() {
        return hairColor;
    }
    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
    public double getHeigh() {
        return heigh;
    }
    public void setHeigh(double heigh) {
        this.heigh = heigh;
    }

    @Override
    String getNamed() {
        return getName() + " is daughter";
    }

    @Override
    public String toString() {
        return "Mother{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", eyeColor='" + getEyeColor() + '\'' +
                ", heigh=" + getHeigh() +
                ", hairColor='" + getHairColor() + '\'' +
                '}';
    }
}
