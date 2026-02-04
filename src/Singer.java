public class Singer extends Person {
    private String bandName;

    public Singer(String name, String designation) {
        super(name, designation);
    }
    public String getBandName() {
        return bandName;
    }
    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    String singing () {
        return "singer is singing";
    }
    String playGuitar() {
        return "singer is playing guitar";
    }
}
