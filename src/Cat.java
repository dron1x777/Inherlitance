public class Cat extends Animal {
    private boolean canMeow;
    private int clawsLength;

    public Cat(String name, int age) {
        super(name, age);
    }
    public void setCanMeow(boolean canMeow) {
        this.canMeow = canMeow;
    }

    public boolean getCanMeow() {
        return canMeow;
    }

    public int getClawsLength() {
        return clawsLength;
    }

    public void setClawsLength(int clawsLength) {
        this.clawsLength = clawsLength;
    }
}
