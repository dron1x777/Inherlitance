public class Dog extends Animal {
    private boolean isDomestic;
    private boolean canBark;

    public Dog(String name, int age) {
        super(name, age);
    }

    public boolean isDomestic() {
        return isDomestic;
    }

    public void setDomestic(boolean domestic) {
        isDomestic = domestic;
    }

    public boolean isCanBark() {
        return canBark;
    }

    public void setCanBark(boolean canBark) {
        this.canBark = canBark;
    }
}
